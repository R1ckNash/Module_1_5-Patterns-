Цепочка ответственности Chain of Responsibility

Цель: Связывание объектов-получателей в цепочку и передача запроса по ней

Для чего используется: Помогает избежать привязки отправителя запроса к его получателю,
что дает возможность обработать данный запрос нескольким объектам

Пример использования: 
- ослабление привязанности (объект не должен знать, кто именно обработает его запрос)
- дополнительная гибкость при распределении обязанностей между объектами