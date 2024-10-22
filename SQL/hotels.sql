PGDMP      (                 |            hotel    16.1    16.1 (               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16753    hotel    DATABASE     �   CREATE DATABASE hotel WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE hotel;
                postgres    false            �            1259    16825    hotels    TABLE     W  CREATE TABLE public.hotels (
    id integer NOT NULL,
    hotel_name character varying(255) NOT NULL,
    hotel_city character varying(255) NOT NULL,
    hotel_adress character varying(255) NOT NULL,
    hotel_email character varying(255) NOT NULL,
    hotel_phone character varying(255) NOT NULL,
    hotel_star character varying(10) NOT NULL,
    hotel_freeparking boolean NOT NULL,
    hotel_freewifi boolean NOT NULL,
    hotel_pool boolean NOT NULL,
    hotel_gym boolean NOT NULL,
    hotel_concierge boolean NOT NULL,
    hotel_spa boolean NOT NULL,
    hotel_roomservice boolean NOT NULL
);
    DROP TABLE public.hotels;
       public         heap    postgres    false            �            1259    16893    hotels_id_seq    SEQUENCE     �   ALTER TABLE public.hotels ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.hotels_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    217            �            1259    16877    reservation    TABLE     N  CREATE TABLE public.reservation (
    id integer NOT NULL,
    room_id integer NOT NULL,
    reservation_str_date date NOT NULL,
    reservation_end_date date NOT NULL,
    reservation_guest_name character varying(255) NOT NULL,
    reservation_guest_phone character varying(40) NOT NULL,
    reservation_total_price real NOT NULL
);
    DROP TABLE public.reservation;
       public         heap    postgres    false            �            1259    16876    reservation_id_seq    SEQUENCE     �   ALTER TABLE public.reservation ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.reservation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    225            �            1259    16856    rooms    TABLE     7  CREATE TABLE public.rooms (
    id integer NOT NULL,
    hotel_id integer NOT NULL,
    room_hotel_type_id integer NOT NULL,
    room_season_id integer NOT NULL,
    room_price_adult real NOT NULL,
    room_price_child real NOT NULL,
    room_name character varying(255) NOT NULL,
    room_bed_count smallint NOT NULL,
    room_tv boolean NOT NULL,
    room_minibar boolean NOT NULL,
    room_console boolean NOT NULL,
    room_squarefootage smallint NOT NULL,
    room_safe boolean NOT NULL,
    room_projection boolean NOT NULL,
    room_stock smallint NOT NULL
);
    DROP TABLE public.rooms;
       public         heap    postgres    false            �            1259    16855    rooms_id_seq    SEQUENCE     �   ALTER TABLE public.rooms ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.rooms_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    223            �            1259    16845    season    TABLE     �   CREATE TABLE public.season (
    id integer NOT NULL,
    hotel_id integer NOT NULL,
    season_start_date date NOT NULL,
    season_end_date date NOT NULL,
    season_name character varying(255) NOT NULL,
    season_rate real NOT NULL
);
    DROP TABLE public.season;
       public         heap    postgres    false            �            1259    16844    season_id_seq    SEQUENCE     �   ALTER TABLE public.season ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.season_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    221            �            1259    16833    types    TABLE     �   CREATE TABLE public.types (
    id integer NOT NULL,
    hotel_id integer NOT NULL,
    type_hotel_name character varying(255) NOT NULL
);
    DROP TABLE public.types;
       public         heap    postgres    false            �            1259    16832    types_id_seq    SEQUENCE     �   ALTER TABLE public.types ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.types_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    219            �            1259    16818    users    TABLE     �   CREATE TABLE public.users (
    id integer NOT NULL,
    user_name character varying(255) NOT NULL,
    user_password character varying(255) NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    16817    users_id_seq    SEQUENCE     �   ALTER TABLE public.users ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    216                      0    16825    hotels 
   TABLE DATA           �   COPY public.hotels (id, hotel_name, hotel_city, hotel_adress, hotel_email, hotel_phone, hotel_star, hotel_freeparking, hotel_freewifi, hotel_pool, hotel_gym, hotel_concierge, hotel_spa, hotel_roomservice) FROM stdin;
    public          postgres    false    217   U2                 0    16877    reservation 
   TABLE DATA           �   COPY public.reservation (id, room_id, reservation_str_date, reservation_end_date, reservation_guest_name, reservation_guest_phone, reservation_total_price) FROM stdin;
    public          postgres    false    225   Y3                 0    16856    rooms 
   TABLE DATA           �   COPY public.rooms (id, hotel_id, room_hotel_type_id, room_season_id, room_price_adult, room_price_child, room_name, room_bed_count, room_tv, room_minibar, room_console, room_squarefootage, room_safe, room_projection, room_stock) FROM stdin;
    public          postgres    false    223   �3                 0    16845    season 
   TABLE DATA           l   COPY public.season (id, hotel_id, season_start_date, season_end_date, season_name, season_rate) FROM stdin;
    public          postgres    false    221   �4                 0    16833    types 
   TABLE DATA           >   COPY public.types (id, hotel_id, type_hotel_name) FROM stdin;
    public          postgres    false    219   L5                 0    16818    users 
   TABLE DATA           H   COPY public.users (id, user_name, user_password, user_role) FROM stdin;
    public          postgres    false    216   �5                  0    0    hotels_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.hotels_id_seq', 10, true);
          public          postgres    false    226                       0    0    reservation_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.reservation_id_seq', 23, true);
          public          postgres    false    224                       0    0    rooms_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.rooms_id_seq', 10, true);
          public          postgres    false    222                       0    0    season_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.season_id_seq', 8, true);
          public          postgres    false    220                        0    0    types_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.types_id_seq', 18, true);
          public          postgres    false    218            !           0    0    users_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.users_id_seq', 19, true);
          public          postgres    false    215            l           2606    16831    hotels hotels_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.hotels
    ADD CONSTRAINT hotels_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.hotels DROP CONSTRAINT hotels_pkey;
       public            postgres    false    217            t           2606    16883    reservation reservation_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_pkey;
       public            postgres    false    225            r           2606    16860    rooms rooms_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT rooms_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.rooms DROP CONSTRAINT rooms_pkey;
       public            postgres    false    223            p           2606    16849    season season_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.season
    ADD CONSTRAINT season_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.season DROP CONSTRAINT season_pkey;
       public            postgres    false    221            n           2606    16837    types types_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.types
    ADD CONSTRAINT types_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.types DROP CONSTRAINT types_pkey;
       public            postgres    false    219            j           2606    16822    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    216            z           2606    16884 $   reservation reservation_room_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_room_id_fkey FOREIGN KEY (room_id) REFERENCES public.rooms(id);
 N   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_room_id_fkey;
       public          postgres    false    4722    225    223            w           2606    16861    rooms room_hotel_id_fkey    FK CONSTRAINT     y   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT room_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotels(id);
 B   ALTER TABLE ONLY public.rooms DROP CONSTRAINT room_hotel_id_fkey;
       public          postgres    false    223    217    4716            x           2606    16866    rooms room_hotel_type_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT room_hotel_type_id_fkey FOREIGN KEY (room_hotel_type_id) REFERENCES public.types(id);
 G   ALTER TABLE ONLY public.rooms DROP CONSTRAINT room_hotel_type_id_fkey;
       public          postgres    false    4718    219    223            y           2606    16871    rooms room_season_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT room_season_id_fkey FOREIGN KEY (room_season_id) REFERENCES public.season(id);
 C   ALTER TABLE ONLY public.rooms DROP CONSTRAINT room_season_id_fkey;
       public          postgres    false    4720    223    221            v           2606    16850    season season_hotel_id_fkey    FK CONSTRAINT     |   ALTER TABLE ONLY public.season
    ADD CONSTRAINT season_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotels(id);
 E   ALTER TABLE ONLY public.season DROP CONSTRAINT season_hotel_id_fkey;
       public          postgres    false    4716    221    217            u           2606    16839    types types_hotel_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.types
    ADD CONSTRAINT types_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotels(id) NOT VALID;
 C   ALTER TABLE ONLY public.types DROP CONSTRAINT types_hotel_id_fkey;
       public          postgres    false    4716    217    219               �   x���=o�0���ȎAB(٠0�!u�r�Dul�vT���6q?T{�-=~��]	/7R�I���´ɐ*�5{��=����E��*0�M�p�)�^��B�5j�"��R�O���w�� SD��ɹ�3וl����gg��2��c3�3
C��l�Ku�E+�n���rh8�.���a��=��z�X��\��<m�X�WRR�A
�	���W�N�ީ����-�e�Hg��؃(cX�BN�          �   x�m�;�@k�. ?g�!�@�&�V�$���|���)<����T4�~�F��,�q�������3TDX��	O?��Sy(����� r�]�R=����6��X�D�7�^~����Y;��e��y��O&F�         �   x�e�M�0��ɯ���]����뮞��(���}�}���ڇ�o����I(�P?<�+}U�Gc�ՠ
����˩�`�*���|J7_8�&��>lF�2.ʰ(U8@W�
�����d���bV:z7��ְ�I؃�Q���!�l��a6�n?�{eD@�d�C���5]�����0���K�         �   x�m��
�0E����?��^c;� nN�K�(��Bl��T�v��1p0l�b�X��\s�!A�,��TH�2y�q�|�d5�b:�8��������SbVp}j.��Y\-�m�k=�=7�~|쮉�8$.         s   x�3�4�t�����K�)-�,K�2���%*��[p�r����(8�'�pYr� s�ڐ���f�A���
�y9�\�F@.6SM8-�K�%Є�8-��5�ڏU�$�*���� �qI�         =   x�34�LL����4426�0�M8KR�K� b�ũE\��`!cd!3��	��%�F����� ;��     