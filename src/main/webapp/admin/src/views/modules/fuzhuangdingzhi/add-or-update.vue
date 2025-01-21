<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="订单编号" prop="dingdanbianhao">
            <el-input v-model="ruleForm.dingdanbianhao" 
                placeholder="订单编号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.dingdanbianhao" label="订单编号" prop="dingdanbianhao">
              <el-input v-model="ruleForm.dingdanbianhao" 
                placeholder="订单编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="服装名称" prop="fuzhuangmingcheng">
          <el-input v-model="ruleForm.fuzhuangmingcheng" 
              placeholder="服装名称" clearable  :readonly="ro.fuzhuangmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="服装名称" prop="fuzhuangmingcheng">
              <el-input v-model="ruleForm.fuzhuangmingcheng" 
                placeholder="服装名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="面料" prop="mianliao">
          <el-input v-model="ruleForm.mianliao" 
              placeholder="面料" clearable  :readonly="ro.mianliao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="面料" prop="mianliao">
              <el-input v-model="ruleForm.mianliao" 
                placeholder="面料" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="服装颜色" prop="fuzhuangyanse">
          <el-input v-model="ruleForm.fuzhuangyanse" 
              placeholder="服装颜色" clearable  :readonly="ro.fuzhuangyanse"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="服装颜色" prop="fuzhuangyanse">
              <el-input v-model="ruleForm.fuzhuangyanse" 
                placeholder="服装颜色" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="尺码" prop="chima">
          <el-select :disabled="ro.chima" v-model="ruleForm.chima" placeholder="请选择尺码">
            <el-option
                v-for="(item,index) in chimaOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="尺码" prop="chima">
	      <el-input v-model="ruleForm.chima"
                placeholder="尺码" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="定制价格" prop="dingzhijiage">
          <el-input v-model="ruleForm.dingzhijiage" 
              placeholder="定制价格" clearable  :readonly="ro.dingzhijiage"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="定制价格" prop="dingzhijiage">
              <el-input v-model="ruleForm.dingzhijiage" 
                placeholder="定制价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="定制数量" prop="dingzhishuliang">
          <el-input v-model="ruleForm.dingzhishuliang" 
              placeholder="定制数量" clearable  :readonly="ro.dingzhishuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="定制数量" prop="dingzhishuliang">
              <el-input v-model="ruleForm.dingzhishuliang" 
                placeholder="定制数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="总价格" prop="zongjiage">
            <el-input v-model="zongjiage"
                placeholder="总价格" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zongjiage" label="总价格" prop="zongjiage">
              <el-input v-model="ruleForm.zongjiage" 
                placeholder="总价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="下单时间" prop="xiadanshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.xiadanshijian" 
                type="datetime"
                :readonly="ro.xiadanshijian"
                placeholder="下单时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.xiadanshijian" label="下单时间" prop="xiadanshijian">
              <el-input v-model="ruleForm.xiadanshijian" 
                placeholder="下单时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable  :readonly="ro.yonghuming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户名" prop="yonghuming">
              <el-input v-model="ruleForm.yonghuming" 
                placeholder="用户名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机" prop="shouji">
              <el-input v-model="ruleForm.shouji" 
                placeholder="手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="邮寄地址" prop="youjidizhi">
          <el-input v-model="ruleForm.youjidizhi" 
              placeholder="邮寄地址" clearable  :readonly="ro.youjidizhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="邮寄地址" prop="youjidizhi">
              <el-input v-model="ruleForm.youjidizhi" 
                placeholder="邮寄地址" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="定制内容" prop="dingzhineirong">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.dingzhineirong" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.dingzhineirong" label="定制内容" prop="dingzhineirong">
                    <span v-html="ruleForm.dingzhineirong"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(234, 207, 164, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"rgba(253, 253, 229, 1)","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"rgba(253, 253, 229, 1)","textareaBorderStyle":"solid","btnCancelWidth":"100px","textareaHeight":"100px","dateBgColor":"rgba(253, 253, 229, 1)","btnSaveBorderRadius":"25px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(0, 0, 0, 1)","addEditBoxColor":"rgba(253, 253, 229, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(74, 50, 22, 1)","uploadIconFontColor":"rgba(74, 50, 22, 1)","textareaBorderColor":"rgba(74, 50, 22, 1)","btnCancelBgColor":"rgba(74, 50, 22, 1)","selectLableColor":"rgba(0, 0, 0, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"2px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(0, 0, 0, 1)","btnCancelHeight":"45px","inputHeight":"45px","btnCancelFontColor":"rgba(255, 255, 255, 1)","dateBorderColor":"rgba(74, 50, 22, 1)","dateIconFontColor":"rgba(0, 0, 0, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(0, 0, 0, 1)","dateFontSize":"14px","inputBorderWidth":"2px","uploadIconFontSize":"28px","selectHeight":"45px","inputFontColor":"rgba(0, 0, 0, 1)","uploadHeight":"148px","textareaLableColor":"rgba(0, 0, 0, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"25px","inputBgColor":"rgba(253, 253, 229, 1)","inputLableFontSize":"14px","uploadLableColor":"rgba(0, 0, 0, 1)","uploadBorderRadius":"4px","btnSaveHeight":"45px","selectBgColor":"rgba(253, 253, 229, 1)","btnSaveWidth":"100px","selectIconFontSize":"14px","dateHeight":"46px","selectBorderColor":"rgba(74, 50, 22, 1)","inputBorderColor":"rgba(74, 50, 22, 1)","uploadBorderColor":"rgba(74, 50, 22, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"2px","dateFontColor":"rgba(0, 0, 0, 1)","btnCancelBorderWidth":"4px","uploadBorderWidth":"2px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"rgba(0, 0, 0, 1)","btnSaveBorderColor":"rgba(234, 207, 164, 1)","btnSaveBorderWidth":"4px"},
      id: '',
      type: '',
      ro:{
	dingdanbianhao : false,
	fuzhuangmingcheng : false,
	mianliao : false,
	fuzhuangyanse : false,
	chima : false,
	dingzhineirong : false,
	dingzhijiage : false,
	dingzhishuliang : false,
	zongjiage : false,
	xiadanshijian : false,
	yonghuming : false,
	xingming : false,
	shouji : false,
	youjidizhi : false,
	ispay : false,
      },
      ruleForm: {
        dingdanbianhao: this.getUUID(),
        fuzhuangmingcheng: '',
        mianliao: '',
        fuzhuangyanse: '',
        chima: '',
        dingzhineirong: '',
        dingzhijiage: '',
        dingzhishuliang: '',
        zongjiage: '',
        xiadanshijian: '',
        yonghuming: '',
        xingming: '',
        shouji: '',
        youjidizhi: '',
      },
          chimaOptions: [],
      rules: {
          dingdanbianhao: [
          ],
          fuzhuangmingcheng: [
                { required: true, message: '服装名称不能为空', trigger: 'blur' },
          ],
          mianliao: [
          ],
          fuzhuangyanse: [
          ],
          chima: [
                { required: true, message: '尺码不能为空', trigger: 'blur' },
          ],
          dingzhineirong: [
                { required: true, message: '定制内容不能为空', trigger: 'blur' },
          ],
          dingzhijiage: [
                { required: true, message: '定制价格不能为空', trigger: 'blur' },
                { validator: validateNumber, trigger: 'blur' },
          ],
          dingzhishuliang: [
                { required: true, message: '定制数量不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          zongjiage: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          xiadanshijian: [
          ],
          yonghuming: [
          ],
          xingming: [
          ],
          shouji: [
                { validator: validateMobile, trigger: 'blur' },
          ],
          youjidizhi: [
                { required: true, message: '邮寄地址不能为空', trigger: 'blur' },
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {


    zongjiage:{
      get: function () {
        return 1*this.ruleForm.dingzhijiage*this.ruleForm.dingzhishuliang
      }
    },

  },
  created() {
	this.ruleForm.xiadanshijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='dingdanbianhao'){
            this.ruleForm.dingdanbianhao = obj[o];
	    this.ro.dingdanbianhao = true;
            continue;
          }
          if(o=='fuzhuangmingcheng'){
            this.ruleForm.fuzhuangmingcheng = obj[o];
	    this.ro.fuzhuangmingcheng = true;
            continue;
          }
          if(o=='mianliao'){
            this.ruleForm.mianliao = obj[o];
	    this.ro.mianliao = true;
            continue;
          }
          if(o=='fuzhuangyanse'){
            this.ruleForm.fuzhuangyanse = obj[o];
	    this.ro.fuzhuangyanse = true;
            continue;
          }
          if(o=='chima'){
            this.ruleForm.chima = obj[o];
	    this.ro.chima = true;
            continue;
          }
          if(o=='dingzhineirong'){
            this.ruleForm.dingzhineirong = obj[o];
	    this.ro.dingzhineirong = true;
            continue;
          }
          if(o=='dingzhijiage'){
            this.ruleForm.dingzhijiage = obj[o];
	    this.ro.dingzhijiage = true;
            continue;
          }
          if(o=='dingzhishuliang'){
            this.ruleForm.dingzhishuliang = obj[o];
	    this.ro.dingzhishuliang = true;
            continue;
          }
          if(o=='zongjiage'){
            this.ruleForm.zongjiage = obj[o];
	    this.ro.zongjiage = true;
            continue;
          }
          if(o=='xiadanshijian'){
            this.ruleForm.xiadanshijian = obj[o];
	    this.ro.xiadanshijian = true;
            continue;
          }
          if(o=='yonghuming'){
            this.ruleForm.yonghuming = obj[o];
	    this.ro.yonghuming = true;
            continue;
          }
          if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
          if(o=='shouji'){
            this.ruleForm.shouji = obj[o];
	    this.ro.shouji = true;
            continue;
          }
          if(o=='youjidizhi'){
            this.ruleForm.youjidizhi = obj[o];
	    this.ro.youjidizhi = true;
            continue;
          }
        }
        this.ruleForm.dingzhishuliang = 0
	    this.ro.dingzhishuliang = false;
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(this.$storage.get("role")!="管理员") {
			this.ro.xiadanshijian = true;
		}
		if(json.yonghuming!=''&&json.yonghuming){
                this.ruleForm.yonghuming = json.yonghuming
	    		this.ro.yonghuming = true;
		}
		if(json.xingming!=''&&json.xingming){
                this.ruleForm.xingming = json.xingming
	    		this.ro.xingming = true;
		}
		if(json.shouji!=''&&json.shouji){
                this.ruleForm.shouji = json.shouji
	    		this.ro.shouji = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.chimaOptions = "S,M,XL,XLL,XLLL".split(',')
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `fuzhuangdingzhi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.dingzhineirong = this.ruleForm.dingzhineirong.replace(reg,'../../../ssmegfm3/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
        this.ruleForm.zongjiage = this.zongjiage































var objcross = this.$storage.getObj('crossObj');
      var table = this.$storage.getObj('crossTable');
      if(objcross!=null) {
	      objcross.dingzhishuliang = objcross.dingzhishuliang - this.ruleForm.dingzhishuliang
	      if(objcross.dingzhishuliang<0){
		this.$message.error("定制数量不足");
		return
	      }
                }

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                              this.$http({
                                  url: `${table}/update`,
                                  method: "post",
                                  data: objcross
                                }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "fuzhuangdingzhi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `fuzhuangdingzhi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.fuzhuangdingzhiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
                      this.$http({
                          url: `${table}/update`,
                          method: "post",
                          data: objcross
                        }).then(({ data }) => {});
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `fuzhuangdingzhi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
                  this.$http({
                      url: `${table}/update`,
                      method: "post",
                      data: objcross
                    }).then(({ data }) => {});
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.fuzhuangdingzhiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.fuzhuangdingzhiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
