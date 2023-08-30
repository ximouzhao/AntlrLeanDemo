## 官方网站 https://www.antlr.org/ https://github.com/antlr/antlr4
ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or translating structured text or binary files. It's widely used to build languages, tools, and frameworks. From a grammar, ANTLR generates a parser that can build and walk parse trees.

## 应用场景
1. 写一个可以支持复杂的运算的计算器应用，`(1+2*3-4+(-4))`
2. (业务实践)实现业务规则，例如 `差旅费>(交通费+住宿费+餐费*0.4)+市内交通费`，当这个规则不满足的时候产生告警，或者reject
3. (业务实践)实现报表的自定义取数规则，类似增强版本的excel的公式，或者自定义页面某些位置显示某些数据，比如：配置报表的某个单元格=`replace(get_from_("table_name","first_col=1 and second=2")*0.8,"$","￥")`
4. 实现领域特定语言(Domain Specific Language)实现在界面上配置复杂的处理逻辑，比如要做日志的处理：`format_time(convert_timezone("$.xxx.time","+8"),"yyyy-MM-dd HH:mm:ss").replece` 可以实现用户调用封装好的一些处理函数，组合起来完成复杂的功能
5. (业务实践)自定义查询sql语句的校验，解析
6. 代码格式化，代码编译，分析
