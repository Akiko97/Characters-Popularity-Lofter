# Characters-Popularity-Lofter

基于关键词提取技术的乐乎平台中文作品标签识别和角色热度统计系统

[项目主页](https://pengfcb.github.io/Characters-Popularity-Lofter/)

本项目使用如下开源软件

* [gson](https://github.com/google/gson)
* [HanLP](https://github.com/hankcs/HanLP)
* [jcommon](https://github.com/jfree/jcommon)
* [jfreechart](https://github.com/jfree/jfreechart)

项目展示视频背景音乐《Shadow Of Truth》由[Audionautix](https://audionautix.com)提供

[下载最新版](https://github.com/PengFCB/Characters-Popularity-Lofter/releases/download/rc1.0/rc1.0.zip)

## 使用

1. 安装依赖：

```shell
pip3 install bs4 requests pyhanlp
```

2. 爬取数据集：

```shell
cd crawler 
python3 ./crawler.py
```

3. 排行榜：

   直接运行CPL.jar

4. 生成语料库：
```
cd corpus/tools/ 
python3 ./main.py
```

## License
```
   Copyright 2019 CPL Group

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

## Developer
* [@PengFCB](https://github.com/PengFCB)
* [@Nanami-Mo](https://github.com/Nanami-Mo)
* [@Akiko97](https://github.com/Akiko97)
* [@zyc14588](https://github.com/zyc14588)
