package com.kws.eight.eleven;

public class ArrayTest {

    private String[] skills;

//  public String[] getSkills() {
//      return skills;
//  }
    public String[] getSkills() {
        String[] result = new String[skills.length];
        System.arraycopy(skills, 0, result, 0, skills.length);
        return result;
    }

//  public void setSkills(String[] arg) {
//      this.skills = skills;
//  }

    public void setSkill(int index, String skill) {
        skills = new String[skill.length()];
        skills[index] = skill;
    }

    public void setSkills(String[] arg) {
        skills = new String[skills.length];
        for(int i = 0; i < skills.length; i++){
            setSkill(i,arg[i]);
        }
    }

}
