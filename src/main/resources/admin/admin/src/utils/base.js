const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooty2rp6/",
            name: "springbooty2rp6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooty2rp6/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的网络海鲜市场系统的设计与实现"
        } 
    }
}
export default base
