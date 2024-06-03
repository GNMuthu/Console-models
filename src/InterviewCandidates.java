import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Candidates
{
private String candidateName, candidatePrimarySkill, candidateQualification;
private int experienceInMonths;
void getCandidateData()throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Fana Consultancy");
    System.out.println("Enter Candidates Details");
    System.out.println("Enter Candidate Name");
    candidateName=br.readLine();
    System.out.println("Enter Primary Skills ");
    candidatePrimarySkill=br.readLine();
    System.out.println("Enter Candidates Qualifications");
    candidateQualification=br.readLine();
    System.out.println("Enter Experience in months");
    experienceInMonths=Integer.parseInt(br.readLine());
}

String displayCandidatesData()
{
    System.out.println("Here is the Candidates details:");
    System.out.println("Candidate Name:" +candidateName+"\n Candidates Primary Skills:"+candidatePrimarySkill+"\nCandidates Qualifications:"+candidateQualification+"\n Experience in Months:"+experienceInMonths);
    return null;
}

}
class InterviewCandidates
{
    public static void main(String[] args) throws IOException {
        Candidates candi=new Candidates();
        candi.getCandidateData();
String s = candi.displayCandidatesData();
         //System.out.println(s);
    }
}