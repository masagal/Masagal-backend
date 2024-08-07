package tech.masagal.markusai.user;

public record UserDto(Long id, String clerkId, String name, String email, boolean isAdmin, String imageUrl, String invitationToken) {
    static public UserDto fromUser(User user) {
        return new UserDto(user.getId(), user.getClerkId(), user.getName(), user.getEmail(), user.getIsAdmin(), user.getImageUrl(), user.getInvitationToken());
    }
    public User toUser() {
        User user = new User();
        user.setClerkId(clerkId());
        user.setName(name());
        user.setEmail(email());
        user.setIsAdmin(isAdmin());
        return user;
    }
}
