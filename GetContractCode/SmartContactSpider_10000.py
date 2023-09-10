# -*- coding: utf8 -*-
# SmartContactSpider.py
import requests
from bs4 import BeautifulSoup
import os
import time


def printtime():
    print(time.strftime("%Y-%m-%d %H:%M:%S:", time.localtime()), end=' ')
    return 0


def getsccodecore(eachLine):
    # 伪装成浏览器
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.87 Safari/537.36'}

    failedTimes = 100
    while True:  # 在制定次数内一直循环，直到访问站点成功

        if (failedTimes <= 0):
            printtime()
            print("失败次数过多，请检查网络环境！")
            break

        failedTimes -= 1
        try:
            # 以下except都是用来捕获当requests请求出现异常时，
            # 通过捕获然后等待网络情况的变化，以此来保护程序的不间断运行
            printtime()
            eachLineurl = eachLine[:80]
            print('正在连接的的网址链接是 ' + eachLineurl)
            response = requests.get(eachLineurl, headers=headers, timeout=5)
            break

        except requests.exceptions.ConnectionError:
            printtime()
            print('ConnectionError！请等待3秒！')
            time.sleep(3)

        except requests.exceptions.ChunkedEncodingError:
            printtime()
            print('ChunkedEncodingError！请等待3秒！')
            time.sleep(3)

        except:
            printtime()
            print('Unfortunitely,出现未知错误！请等待3秒！')
            time.sleep(3)

    response.encoding = response.apparent_encoding
    soup = BeautifulSoup(response.text, "html.parser")
    # js-sourcecopyarea editor ace_editor ace-dawn
    targetPRE = soup.find_all('pre', 'js-sourcecopyarea editor')
    filepath = getPathCodeDirectory()

    # filename 从address.txt文档中截取；从第34位到75位
    # filename为合约地址 '0x5f3ed22b53ac0a001f0feedc2a3985999377c2ab'
    filename = eachLine[33:75]

    if (os.path.exists(filepath + filename + '.sol')):
        printtime()
        print(filename + '.sol已存在！')
        return 0

    fo = open(filepath + filename + '.sol', "w+", encoding="utf-8")
    for eachpre in targetPRE:
        fo.write(eachpre.text)
    fo.close()
    printtime()
    print(filename + '.sol新建完成！')

    return 0


def getsccode():
    filepath = getFilePathAddress_txt()
    try:
        SCAddress = open(
            filepath, "r")

    except:
        printtime()
        print('打开智能合约URL地址仓库错误！请检查文件目录是否正确！')

    # 一行一行的读取 address.txt 的内容
    for eachLine in SCAddress:
        # print("test:" + eachLine[:80])
        # address.txt每一行前80字段 https://cn.etherscan.com/address/0xEeE690AAA67d1eE33365c02C3Bf477A93867052f#code
        getsccodecore(eachLine)  # 这个才是获取智能合约代码的核心函数

    SCAddress.close()
    return 0


def getSCAddress(eachurl, filepath):
    # 伪装成某种浏览器，防止被服务器拒绝服务
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.87 Safari/537.36'}

    # 设置访问网址失败的最高次数，达到制定次数后，报告错误，停止程序
    failedTimes = 50

    while True:  # 一直循环，直到在制定的次数内访问站点成功

        if (failedTimes <= 0):
            printtime()
            print("失败次数过多，请检查网络环境！")
            break

        failedTimes -= 1  # 每执行一次就要减1
        try:
            # 以下except都是用来捕获当requests请求出现异常时，
            # 通过捕获然后等待网络情况的变化，以此来保护程序的不间断运行
            print('正在连接的的网址链接是 ' + eachurl)

            response = requests.get(url=eachurl, headers=headers, timeout=5)

            # 执行到这一句意味着成功访问，于是退出while循环
            break
        except requests.exceptions.ConnectionError:
            printtime()
            print('ConnectionError!请等待3秒！')
            time.sleep(3)

        except requests.exceptions.ChunkedEncodingError:
            printtime()
            print('ChunkedEncodingError!请等待3秒！')
            time.sleep(3)

        except:
            printtime()
            print('出现未知错误！请等待3秒！')
            time.sleep(3)

    # 转换成UTF-8编码
    response.encoding = response.apparent_encoding

    # 煲汤 爬虫解析
    soup = BeautifulSoup(response.text, "html.parser")

    # 查找这个字段，这个字段下，包含智能合约代码的URL地址
    # targetDiv = soup.find_all('div', 'table-responsive')

    try:
        targetTBody = soup.find_all('tbody', 'align-middle text-nowrap')[0]

    except:
        printtime()
        print("targetTBody未成功获取！")
        return 1

    # 以追加的方式打开文件。
    # 如果文件不存在，则新建；如果文件已存在，则在文件指针末尾追加
    fo = open(filepath, "a")

    # 把每一个地址，都写到文件里面保存下来
    for targetTR in targetTBody:
        # print(targetTR)
        # 获取每一行
        if targetTR.name == 'tr':
            # 获取一行所有列
            data = targetTR.find_all('td')

            Address = data[0].getText()
            Name = data[1].getText()
            Compiler = data[2].getText()
            Version = data[3].getText()
            Balance = data[4].getText()
            VerifiedTime = data[7].getText()
            if "Solidity".lower() in Compiler.lower():
                fo.write("https://cn.etherscan.com" + targetTR.td.find('a', 'me-1').attrs['href']
                         + ' ' + VerifiedTime + ':' + Name + '==>Version:' + Version + '==>Balance:' + Balance + "\n")

    fo.close()
    return 0

# 仅显示最后500经已验证的合约源码


def getUrlList500():

    urlList = []

    for i in range(5):
        page = i + 1
        urlList.append(
            "https://cn.etherscan.com/contractsVerified/"+str(page)+"?filter=solc&ps=100")

    return urlList

# 仅显示最后10,000经已验证的合约源码 (OpenSource)


def getUrlList10000():

    urlList = []

    for i in range(100):
        page = i + 1
        urlList.append(
            "https://cn.etherscan.com/contractsVerified/"+str(page)+"?filter=opensourcelicense&ps=100")

    return urlList


def getFilePathAddress_txt():
    # 获取当前脚本所在的目录
    current_directory = os.path.dirname(os.path.abspath(__file__))
    # 构建相对路径到address.txt文件
    relative_file_path = "address/address_10000.txt"
    # 构建访问address.txt的完整路径
    address_file_path = os.path.join(
        current_directory, relative_file_path)
    return address_file_path


def getPathCodeDirectory():
    # 获取当前脚本所在的目录
    current_directory = os.path.dirname(os.path.abspath(__file__))
    # 构建相对路径到code文件夹
    relative_file_path = "code10000/"
    # 构建访问code目录的完整路径
    code_directory_path = os.path.join(
        current_directory, relative_file_path)
    return code_directory_path


def updatescurl():
    # TODO:
    # getUrlList10000 getUrlList500
    urlList = getUrlList10000()

    # filepath是保存要爬取的智能合约地址的文件的存放路径
    # 请根据自己的需求改成自己想要的路径。
    filepath = getFilePathAddress_txt()

    # 把旧的存放合约地址的文件清除干净
    try:
        if (os.path.exists(filepath)):
            os.remove(filepath)
            printtime()
            print('已清除%s目录下的旧文件（仓库）！' % filepath)
    except IOError:

        printtime()
        print("出现一个不能处理的错误，终止程序：IOError!")

        # 函数不正常执行，返回1
        return 1

    # 读取urlList里的每一个URL网页里的智能合约地址
    for eachurl in urlList:
        time = 0
        while (1 == getSCAddress(eachurl, filepath)):
            time += 1
            if (time == 10):
                break
            pass

    # 函数正常执行，返回0
    return 0


def main():
    # 更新要爬取的智能合约的地址
    updatescurl()

    # 根据智能合约的地址去爬取智能合约的代码
    getsccode()


main()
