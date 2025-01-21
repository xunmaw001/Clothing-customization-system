const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmegfm3/",
            name: "ssmegfm3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmegfm3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "服装定制系统"
        } 
    }
}
export default base
