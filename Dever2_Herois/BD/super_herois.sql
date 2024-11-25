Create database herois;
use herois;

Create table super_heroi(
id BIGINT auto_increment primary key,
nome varchar(255),
apelido varchar(255),
superPoder varchar(255),
fraqueza varchar(255),
historiaOrigem text,
primeiraAparicao date
);

INSERT INTO super_heroi (nome, apelido, superPoder, fraqueza, historiaOrigem, primeiraAparicao) VALUES
('Isabel Ferreira', 'Luz do Amanhã', 'Manipulação da luz', 'Escuridão intensa', 'Isabel descobriu seu poder em um eclipse solar, quando conseguiu canalizar a luz em formas de energia. Ela usa suas habilidades para combater o mal.', '2022-05-10'),

('Carlos Mendes', 'Ferro', 'Pele metálica', 'Magnetismo', 'Um acidente em uma fábrica o expôs a uma substância misteriosa, transformando sua pele em metal. Ele luta contra vilões que podem manipulá-lo com magnetismo.', '2020-08-14'),

('Juliana Lima', 'Terra', 'Controle da terra', 'Água', 'Após um terremoto devastador, Juliana descobriu que podia controlar a terra e suas formações. Agora, ela protege sua cidade de desastres naturais e vilões.', '2021-02-28'),

('André Souza', 'Sonic', 'Sons hipersônicos', 'Silêncio absoluto', 'André, um músico talentoso, ganhou poderes sonoros após um experimento de acústica. Ele usa seus sons para desorientar inimigos e proteger os inocentes.', '2023-03-21'),

('Fernanda Ribeiro', 'Neve', 'Controle do gelo', 'Calor extremo', 'Uma experiência científica com temperatura extrema deu a Fernanda a habilidade de controlar o gelo. Ela usa seus poderes para salvar pessoas em situações de calor extremo.', '2022-12-15'),

('Ricardo Alves', 'Coração de Pedra', 'Invulnerabilidade', 'Fragilidade emocional', 'Ricardo se tornou invulnerável após um evento trágico em sua vida, mas suas emoções ainda o tornam vulnerável a manipulações.', '2019-09-10'),

('Vanessa Santos', 'Furtiva', 'Camuflagem', 'Luz forte', 'Após um acidente de laboratório, Vanessa ganhou a habilidade de se camuflar no ambiente. Agora, ela utiliza seus poderes para espionar e combater o crime.', '2021-11-01'),

('Felipe Nascimento', 'Tempestade Verde', 'Controle da natureza', 'Destruição da natureza', 'Felipe se conectou com a natureza após um ritual indígena e ganhou poderes sobre plantas e animais. Ele luta contra aqueles que ameaçam o meio ambiente.', '2020-07-25'),

('Bruna Costa', 'Chama', 'Pirocinese', 'Água', 'Após um incidente em uma usina de energia, Bruna descobriu sua capacidade de controlar o fogo. Ela usa essa habilidade para proteger sua cidade.', '2023-06-30'),

('Lucas Martins', 'Guardião', 'Habilidades de combate', 'Armaduras pesadas', 'Um ex-policial, Lucas treinou intensamente para se tornar um lutador contra o crime, mesmo sem superpoderes. Ele usa sua inteligência e habilidades em combate para fazer justiça.', '2021-04-18');
