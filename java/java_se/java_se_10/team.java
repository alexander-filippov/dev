public class team {
	Member member;
	public team(Member member) {
		this.member = member;
	}

	public static void main(String[] args) {
		Member myMember = new Member("Aurieel", "light", 10, 1);
		team myTeam = new team (myMember);

		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
	}
}

class Member {
	private String name;
	private String type;
	private int level;
	private int rank;

	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public int getLevel() {
		return this.level;
	}

	public int getRank() {
		return this.rank;
	}
}