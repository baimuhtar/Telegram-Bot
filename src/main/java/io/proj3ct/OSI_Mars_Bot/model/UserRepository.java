package io.proj3ct.OSI_Mars_Bot.model;


import org.springframework.data.repository.CrudRepository;
// Создаем интерфейс для использования параметров пользователя и его id в дальнейших реализациях
public interface UserRepository extends CrudRepository<User, Long> {

}
