package com.xxkxxy.entity;

import com.xxkxxy.entity.base.BaseUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户类
 * Created by LK on 2018/3/20.
 */
public class User extends BaseUser {
    private static final long serialVersionUID = 1L;

    public User() {
        super();
    }
    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends User{
        /**
         * 需要返回的列
         */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> userIdList;

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){
            return this.userIdSt;
        }

        public Integer getUserIdEd(){
            return this.userIdEd;
        }

        private List<String> userNameList;


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){
            return this.rightFuzzyUserName;
        }
        private List<String> nikeNameList;


        private List<String> fuzzyNikeName;

        public List<String> getFuzzyNikeName(){
            return this.fuzzyNikeName;
        }

        private List<String> rightFuzzyNikeName;

        public List<String> getRightFuzzyNikeName(){
            return this.rightFuzzyNikeName;
        }
        private List<String> emailList;


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){
            return this.rightFuzzyEmail;
        }
        private List<String> passwordList;


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){
            return this.rightFuzzyPassword;
        }
        private List<String> saltList;


        private List<String> fuzzySalt;

        public List<String> getFuzzySalt(){
            return this.fuzzySalt;
        }

        private List<String> rightFuzzySalt;

        public List<String> getRightFuzzySalt(){
            return this.rightFuzzySalt;
        }
        private List<java.time.LocalDateTime> lastLoginTimeList;

        private java.time.LocalDateTime lastLoginTimeSt;

        private java.time.LocalDateTime lastLoginTimeEd;

        public java.time.LocalDateTime getLastLoginTimeSt(){
            return this.lastLoginTimeSt;
        }

        public java.time.LocalDateTime getLastLoginTimeEd(){
            return this.lastLoginTimeEd;
        }

        private List<String> lastLoginIpList;


        private List<String> fuzzyLastLoginIp;

        public List<String> getFuzzyLastLoginIp(){
            return this.fuzzyLastLoginIp;
        }

        private List<String> rightFuzzyLastLoginIp;

        public List<String> getRightFuzzyLastLoginIp(){
            return this.rightFuzzyLastLoginIp;
        }
        private List<String> loginCountList;


        private List<String> fuzzyLoginCount;

        public List<String> getFuzzyLoginCount(){
            return this.fuzzyLoginCount;
        }

        private List<String> rightFuzzyLoginCount;

        public List<String> getRightFuzzyLoginCount(){
            return this.rightFuzzyLoginCount;
        }
        private List<String> validateCodeList;


        private List<String> fuzzyValidateCode;

        public List<String> getFuzzyValidateCode(){
            return this.fuzzyValidateCode;
        }

        private List<String> rightFuzzyValidateCode;

        public List<String> getRightFuzzyValidateCode(){
            return this.rightFuzzyValidateCode;
        }
        private List<Integer> scoreList;

        private Integer scoreSt;

        private Integer scoreEd;

        public Integer getScoreSt(){
            return this.scoreSt;
        }

        public Integer getScoreEd(){
            return this.scoreEd;
        }

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            if (userId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : userId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userIdList = list;
            }

            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
        }



        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            if (fuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            if (rightFuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            if (userName != null){
                List<String> list = new ArrayList<>();
                for (String item : userName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userNameList = list;
            }

            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }



        public QueryBuilder fuzzyNikeName (List<String> fuzzyNikeName){
            this.fuzzyNikeName = fuzzyNikeName;
            return this;
        }

        public QueryBuilder fuzzyNikeName (String ... fuzzyNikeName){
            if (fuzzyNikeName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyNikeName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyNikeName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyNikeName (List<String> rightFuzzyNikeName){
            this.rightFuzzyNikeName = rightFuzzyNikeName;
            return this;
        }

        public QueryBuilder rightFuzzyNikeName (String ... rightFuzzyNikeName){
            if (rightFuzzyNikeName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyNikeName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyNikeName = list;
            }
            return this;
        }

        public QueryBuilder nikeName(String nikeName){
            setNikeName(nikeName);
            return this;
        }

        public QueryBuilder nikeNameList(String ... nikeName){
            if (nikeName != null){
                List<String> list = new ArrayList<>();
                for (String item : nikeName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.nikeNameList = list;
            }

            return this;
        }

        public QueryBuilder nikeNameList(List<String> nikeName){
            this.nikeNameList = nikeName;
            return this;
        }

        public QueryBuilder fetchNikeName(){
            setFetchFields("fetchFields","nikeName");
            return this;
        }

        public QueryBuilder excludeNikeName(){
            setFetchFields("excludeFields","nikeName");
            return this;
        }



        public QueryBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail (String ... fuzzyEmail){
            if (fuzzyEmail != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyEmail){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyEmail = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            if (rightFuzzyEmail != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyEmail){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyEmail = list;
            }
            return this;
        }

        public QueryBuilder email(String email){
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String ... email){
            if (email != null){
                List<String> list = new ArrayList<>();
                for (String item : email){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.emailList = list;
            }

            return this;
        }

        public QueryBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail(){
            setFetchFields("fetchFields","email");
            return this;
        }

        public QueryBuilder excludeEmail(){
            setFetchFields("excludeFields","email");
            return this;
        }



        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            if (fuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            if (rightFuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            if (password != null){
                List<String> list = new ArrayList<>();
                for (String item : password){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.passwordList = list;
            }

            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }



        public QueryBuilder fuzzySalt (List<String> fuzzySalt){
            this.fuzzySalt = fuzzySalt;
            return this;
        }

        public QueryBuilder fuzzySalt (String ... fuzzySalt){
            if (fuzzySalt != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySalt){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySalt = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySalt (List<String> rightFuzzySalt){
            this.rightFuzzySalt = rightFuzzySalt;
            return this;
        }

        public QueryBuilder rightFuzzySalt (String ... rightFuzzySalt){
            if (rightFuzzySalt != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySalt){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySalt = list;
            }
            return this;
        }

        public QueryBuilder salt(String salt){
            setSalt(salt);
            return this;
        }

        public QueryBuilder saltList(String ... salt){
            if (salt != null){
                List<String> list = new ArrayList<>();
                for (String item : salt){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.saltList = list;
            }

            return this;
        }

        public QueryBuilder saltList(List<String> salt){
            this.saltList = salt;
            return this;
        }

        public QueryBuilder fetchSalt(){
            setFetchFields("fetchFields","salt");
            return this;
        }

        public QueryBuilder excludeSalt(){
            setFetchFields("excludeFields","salt");
            return this;
        }



        public QueryBuilder lastLoginTimeBetWeen(java.time.LocalDateTime lastLoginTimeSt,java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeSt = lastLoginTimeSt;
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }

        public QueryBuilder lastLoginTimeGreaterEqThan(java.time.LocalDateTime lastLoginTimeSt){
            this.lastLoginTimeSt = lastLoginTimeSt;
            return this;
        }
        public QueryBuilder lastLoginTimeLessEqThan(java.time.LocalDateTime lastLoginTimeEd){
            this.lastLoginTimeEd = lastLoginTimeEd;
            return this;
        }


        public QueryBuilder lastLoginTime(java.time.LocalDateTime lastLoginTime){
            setLastLoginTime(lastLoginTime);
            return this;
        }

        public QueryBuilder lastLoginTimeList(java.time.LocalDateTime ... lastLoginTime){
            if (lastLoginTime != null){
                List<java.time.LocalDateTime> list = new ArrayList<>();
                for (java.time.LocalDateTime item : lastLoginTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.lastLoginTimeList = list;
            }

            return this;
        }

        public QueryBuilder lastLoginTimeList(List<java.time.LocalDateTime> lastLoginTime){
            this.lastLoginTimeList = lastLoginTime;
            return this;
        }

        public QueryBuilder fetchLastLoginTime(){
            setFetchFields("fetchFields","lastLoginTime");
            return this;
        }

        public QueryBuilder excludeLastLoginTime(){
            setFetchFields("excludeFields","lastLoginTime");
            return this;
        }



        public QueryBuilder fuzzyLastLoginIp (List<String> fuzzyLastLoginIp){
            this.fuzzyLastLoginIp = fuzzyLastLoginIp;
            return this;
        }

        public QueryBuilder fuzzyLastLoginIp (String ... fuzzyLastLoginIp){
            if (fuzzyLastLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLastLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLastLoginIp = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLastLoginIp (List<String> rightFuzzyLastLoginIp){
            this.rightFuzzyLastLoginIp = rightFuzzyLastLoginIp;
            return this;
        }

        public QueryBuilder rightFuzzyLastLoginIp (String ... rightFuzzyLastLoginIp){
            if (rightFuzzyLastLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLastLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLastLoginIp = list;
            }
            return this;
        }

        public QueryBuilder lastLoginIp(String lastLoginIp){
            setLastLoginIp(lastLoginIp);
            return this;
        }

        public QueryBuilder lastLoginIpList(String ... lastLoginIp){
            if (lastLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : lastLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.lastLoginIpList = list;
            }

            return this;
        }

        public QueryBuilder lastLoginIpList(List<String> lastLoginIp){
            this.lastLoginIpList = lastLoginIp;
            return this;
        }

        public QueryBuilder fetchLastLoginIp(){
            setFetchFields("fetchFields","lastLoginIp");
            return this;
        }

        public QueryBuilder excludeLastLoginIp(){
            setFetchFields("excludeFields","lastLoginIp");
            return this;
        }



        public QueryBuilder fuzzyLoginCount (List<String> fuzzyLoginCount){
            this.fuzzyLoginCount = fuzzyLoginCount;
            return this;
        }

        public QueryBuilder fuzzyLoginCount (String ... fuzzyLoginCount){
            if (fuzzyLoginCount != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLoginCount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLoginCount = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLoginCount (List<String> rightFuzzyLoginCount){
            this.rightFuzzyLoginCount = rightFuzzyLoginCount;
            return this;
        }

        public QueryBuilder rightFuzzyLoginCount (String ... rightFuzzyLoginCount){
            if (rightFuzzyLoginCount != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLoginCount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLoginCount = list;
            }
            return this;
        }

        public QueryBuilder loginCount(String loginCount){
            setLoginCount(loginCount);
            return this;
        }

        public QueryBuilder loginCountList(String ... loginCount){
            if (loginCount != null){
                List<String> list = new ArrayList<>();
                for (String item : loginCount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.loginCountList = list;
            }

            return this;
        }

        public QueryBuilder loginCountList(List<String> loginCount){
            this.loginCountList = loginCount;
            return this;
        }

        public QueryBuilder fetchLoginCount(){
            setFetchFields("fetchFields","loginCount");
            return this;
        }

        public QueryBuilder excludeLoginCount(){
            setFetchFields("excludeFields","loginCount");
            return this;
        }



        public QueryBuilder fuzzyValidateCode (List<String> fuzzyValidateCode){
            this.fuzzyValidateCode = fuzzyValidateCode;
            return this;
        }

        public QueryBuilder fuzzyValidateCode (String ... fuzzyValidateCode){
            if (fuzzyValidateCode != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyValidateCode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyValidateCode = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyValidateCode (List<String> rightFuzzyValidateCode){
            this.rightFuzzyValidateCode = rightFuzzyValidateCode;
            return this;
        }

        public QueryBuilder rightFuzzyValidateCode (String ... rightFuzzyValidateCode){
            if (rightFuzzyValidateCode != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyValidateCode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyValidateCode = list;
            }
            return this;
        }

        public QueryBuilder validateCode(String validateCode){
            setValidateCode(validateCode);
            return this;
        }

        public QueryBuilder validateCodeList(String ... validateCode){
            if (validateCode != null){
                List<String> list = new ArrayList<>();
                for (String item : validateCode){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.validateCodeList = list;
            }

            return this;
        }

        public QueryBuilder validateCodeList(List<String> validateCode){
            this.validateCodeList = validateCode;
            return this;
        }

        public QueryBuilder fetchValidateCode(){
            setFetchFields("fetchFields","validateCode");
            return this;
        }

        public QueryBuilder excludeValidateCode(){
            setFetchFields("excludeFields","validateCode");
            return this;
        }



        public QueryBuilder scoreBetWeen(Integer scoreSt,Integer scoreEd){
            this.scoreSt = scoreSt;
            this.scoreEd = scoreEd;
            return this;
        }

        public QueryBuilder scoreGreaterEqThan(Integer scoreSt){
            this.scoreSt = scoreSt;
            return this;
        }
        public QueryBuilder scoreLessEqThan(Integer scoreEd){
            this.scoreEd = scoreEd;
            return this;
        }


        public QueryBuilder score(Integer score){
            setScore(score);
            return this;
        }

        public QueryBuilder scoreList(Integer ... score){
            if (score != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : score){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.scoreList = list;
            }

            return this;
        }

        public QueryBuilder scoreList(List<Integer> score){
            this.scoreList = score;
            return this;
        }

        public QueryBuilder fetchScore(){
            setFetchFields("fetchFields","score");
            return this;
        }

        public QueryBuilder excludeScore(){
            setFetchFields("excludeFields","score");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.getOrDefault(key,new HashMap<>());
            fields.put(val,true);
            this.fetchFields.putIfAbsent(key,fields);
        }

        public BaseUser build(){
            return this;
        }
    }
}
