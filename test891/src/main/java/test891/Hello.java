package test891;

/**
 * 
 * git clone 命令 ==> 生成本地仓库
 * 
 * 拷贝工程到本地仓库
 * 
 * git commit (保存到本地仓库)   + git push (保存到远程仓库)  (eclipse)
 * 
 * git pull 从远程仓库拉代码 (eclipse)
 * 
 * 
 * 解决代码提交冲突
 * 
 * 现象: push 被拒绝  reject
 * 
 * 解决:
 * 		1. git pull 拉代码 同步本地仓库和远程仓库
 * 		2. 看是否有同行代码冲突
 * 			如果没有,直接 git push
 * 			如果有, 解决冲突, 再 git push
 * 			解决冲突: 1. 手工方式
 * 						<<<<
 * 						本地代码
 * 						====
 * 						远程代码
 * 						>>>>
 * 					2. 自动方式, 在资源管理器,使用  git gui ==> use remote code
 * 
 * 
 * 
 *
 */

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("你好中国"); // 修改的方法
	}
	
	public void test() {
		// 新增的方法
		System.out.println("test--组员");
	}

}
