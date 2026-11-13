class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();

        for (String mail : emails) {

            String[] parts = mail.split("@");

            String local = parts[0];
            String domain = parts[1];

            local = local.split("\\+")[0];
            local = local.replace(".", "");
            
            hs.add(local + "@" + domain);
        }

        return hs.size();
    }
}