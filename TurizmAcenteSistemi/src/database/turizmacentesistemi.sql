PGDMP  	    *                |            turizmacentesistemi    16.2    16.2 )    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16753    turizmacentesistemi    DATABASE     �   CREATE DATABASE turizmacentesistemi WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
 #   DROP DATABASE turizmacentesistemi;
                postgres    false            �            1259    16817    facility    TABLE     c   CREATE TABLE public.facility (
    facility_id bigint NOT NULL,
    facility_name text NOT NULL
);
    DROP TABLE public.facility;
       public         heap    postgres    false            �            1259    16816    facility_facility_id_seq    SEQUENCE     �   ALTER TABLE public.facility ALTER COLUMN facility_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.facility_facility_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    224            �            1259    16762    hotel    TABLE       CREATE TABLE public.hotel (
    hotel_id bigint NOT NULL,
    hotel_name text NOT NULL,
    hotel_city text NOT NULL,
    hotel_area text NOT NULL,
    hotel_adress text NOT NULL,
    hotel_eposta text NOT NULL,
    hotel_phone text NOT NULL,
    hotel_stars text,
    hotel_car_park boolean NOT NULL,
    hotel_wifi boolean NOT NULL,
    hotel_pool boolean NOT NULL,
    hotel_fitness boolean NOT NULL,
    hotel_concierge boolean NOT NULL,
    hotel_spa boolean NOT NULL,
    hotel_room_service boolean NOT NULL
);
    DROP TABLE public.hotel;
       public         heap    postgres    false            �            1259    16799    hotel_season    TABLE     �   CREATE TABLE public.hotel_season (
    season_id bigint NOT NULL,
    hotel_id bigint NOT NULL,
    start_date date NOT NULL,
    finish_date date,
    season_type text
);
     DROP TABLE public.hotel_season;
       public         heap    postgres    false            �            1259    16777    otel_otel_id_seq    SEQUENCE     �   ALTER TABLE public.hotel ALTER COLUMN hotel_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.otel_otel_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    217            �            1259    16768    pension    TABLE     �   CREATE TABLE public.pension (
    pension_id bigint NOT NULL,
    hotel_id bigint NOT NULL,
    pension_type character varying NOT NULL
);
    DROP TABLE public.pension;
       public         heap    postgres    false            �            1259    16795     pension_type_pension_type_id_seq    SEQUENCE     �   ALTER TABLE public.pension ALTER COLUMN pension_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pension_type_pension_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    218            �            1259    17013    reservation    TABLE     �  CREATE TABLE public.reservation (
    reservation_id integer NOT NULL,
    room_id integer,
    guest_name character varying(100),
    guest_id character varying(100),
    guest_email character varying(100),
    guest_phone character varying(20),
    adult_count integer,
    child_count integer,
    check_in_date date,
    check_out_date date,
    guest_note text,
    total_price numeric(10,2),
    hotel_id integer,
    pension_id integer,
    season_id integer
);
    DROP TABLE public.reservation;
       public         heap    postgres    false            �            1259    17012    reservation1_reservation_id_seq    SEQUENCE     �   CREATE SEQUENCE public.reservation1_reservation_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.reservation1_reservation_id_seq;
       public          postgres    false    228            �           0    0    reservation1_reservation_id_seq    SEQUENCE OWNED BY     b   ALTER SEQUENCE public.reservation1_reservation_id_seq OWNED BY public.reservation.reservation_id;
          public          postgres    false    227            �            1259    16930    room    TABLE     �  CREATE TABLE public.room (
    room_id bigint NOT NULL,
    hotel_id bigint NOT NULL,
    pension_id bigint NOT NULL,
    season_id bigint,
    room_type text,
    room_stock integer,
    room_adult_price double precision,
    room_child_price double precision,
    room_bed_capacity integer,
    room_square_meter integer,
    room_televion boolean,
    room_minibar boolean,
    room_game_console boolean,
    room_cash_box boolean,
    room_projection boolean
);
    DROP TABLE public.room;
       public         heap    postgres    false            �            1259    16929    room_room_id_seq    SEQUENCE     �   ALTER TABLE public.room ALTER COLUMN room_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.room_room_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    226            �            1259    16798    season_season_id_seq    SEQUENCE     �   ALTER TABLE public.hotel_season ALTER COLUMN season_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.season_season_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    222            �            1259    16754    user    TABLE     �   CREATE TABLE public."user" (
    user_id bigint NOT NULL,
    user_name text NOT NULL,
    name text,
    user_surname text,
    user_pass text NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public."user";
       public         heap    postgres    false            �            1259    16761    user_user_id_seq    SEQUENCE     �   ALTER TABLE public."user" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    215            8           2604    17016    reservation reservation_id    DEFAULT     �   ALTER TABLE ONLY public.reservation ALTER COLUMN reservation_id SET DEFAULT nextval('public.reservation1_reservation_id_seq'::regclass);
 I   ALTER TABLE public.reservation ALTER COLUMN reservation_id DROP DEFAULT;
       public          postgres    false    227    228    228            �          0    16817    facility 
   TABLE DATA           >   COPY public.facility (facility_id, facility_name) FROM stdin;
    public          postgres    false    224   �2       �          0    16762    hotel 
   TABLE DATA           �   COPY public.hotel (hotel_id, hotel_name, hotel_city, hotel_area, hotel_adress, hotel_eposta, hotel_phone, hotel_stars, hotel_car_park, hotel_wifi, hotel_pool, hotel_fitness, hotel_concierge, hotel_spa, hotel_room_service) FROM stdin;
    public          postgres    false    217   (3       �          0    16799    hotel_season 
   TABLE DATA           a   COPY public.hotel_season (season_id, hotel_id, start_date, finish_date, season_type) FROM stdin;
    public          postgres    false    222   >5       �          0    16768    pension 
   TABLE DATA           E   COPY public.pension (pension_id, hotel_id, pension_type) FROM stdin;
    public          postgres    false    218   �5       �          0    17013    reservation 
   TABLE DATA           �   COPY public.reservation (reservation_id, room_id, guest_name, guest_id, guest_email, guest_phone, adult_count, child_count, check_in_date, check_out_date, guest_note, total_price, hotel_id, pension_id, season_id) FROM stdin;
    public          postgres    false    228   6       �          0    16930    room 
   TABLE DATA           �   COPY public.room (room_id, hotel_id, pension_id, season_id, room_type, room_stock, room_adult_price, room_child_price, room_bed_capacity, room_square_meter, room_televion, room_minibar, room_game_console, room_cash_box, room_projection) FROM stdin;
    public          postgres    false    226   �6       �          0    16754    user 
   TABLE DATA           ^   COPY public."user" (user_id, user_name, name, user_surname, user_pass, user_role) FROM stdin;
    public          postgres    false    215   _7       �           0    0    facility_facility_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.facility_facility_id_seq', 7, true);
          public          postgres    false    223            �           0    0    otel_otel_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.otel_otel_id_seq', 30, true);
          public          postgres    false    219            �           0    0     pension_type_pension_type_id_seq    SEQUENCE SET     O   SELECT pg_catalog.setval('public.pension_type_pension_type_id_seq', 28, true);
          public          postgres    false    220            �           0    0    reservation1_reservation_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.reservation1_reservation_id_seq', 39, true);
          public          postgres    false    227            �           0    0    room_room_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.room_room_id_seq', 26, true);
          public          postgres    false    225            �           0    0    season_season_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.season_season_id_seq', 28, true);
          public          postgres    false    221            �           0    0    user_user_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.user_user_id_seq', 26, true);
          public          postgres    false    216            B           2606    16823    facility facility_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.facility
    ADD CONSTRAINT facility_pkey PRIMARY KEY (facility_id);
 @   ALTER TABLE ONLY public.facility DROP CONSTRAINT facility_pkey;
       public            postgres    false    224            <           2606    16784    hotel otel_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT otel_pkey PRIMARY KEY (hotel_id);
 9   ALTER TABLE ONLY public.hotel DROP CONSTRAINT otel_pkey;
       public            postgres    false    217            >           2606    16797    pension pension_type_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.pension
    ADD CONSTRAINT pension_type_pkey PRIMARY KEY (pension_id);
 C   ALTER TABLE ONLY public.pension DROP CONSTRAINT pension_type_pkey;
       public            postgres    false    218            F           2606    17020    reservation reservation1_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation1_pkey PRIMARY KEY (reservation_id);
 G   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation1_pkey;
       public            postgres    false    228            D           2606    16936    room room_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_pkey PRIMARY KEY (room_id);
 8   ALTER TABLE ONLY public.room DROP CONSTRAINT room_pkey;
       public            postgres    false    226            @           2606    16805    hotel_season season_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.hotel_season
    ADD CONSTRAINT season_pkey PRIMARY KEY (season_id);
 B   ALTER TABLE ONLY public.hotel_season DROP CONSTRAINT season_pkey;
       public            postgres    false    222            :           2606    16760    user user_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            postgres    false    215            �   \   x���@0��ݯ� �������ȋ�DU���wNI���4��ݑP�=�GM�������Ȭf�zAKm���B��r|de,9���      �     x�u�An�@��?����Ԧ�0�� �r�خ��H���c�3�04u.�tU%Wp7���:Pby=F�����Vj��\�!�yт	e	b�x!��Y���`���R(񯐸�z^��u'���A̲�ﱵ�Hh��L����KQHt\�Xn�NXH)֪�tC����851��_����x�P�Z�H�j�PJ�Ģ�!��l����*Ͷǿ�&�P��TU��9�ܕ�.ɵ���k;��@�)��&L1���4�e��Τ0h[���,�n���I}�O�	N�M���q�Ď 7��G�)�TԄq]$u��Ӥ��!��/�b+wh�r�J���}���>$���R�K4D�4»(9���c<������ ��>�l��~|}���7E�KYN��g)Պ����1�T
�̕�0���i��0mR����>{��g�y�����/��(�TV��S?e�.�D7Z3��ߤ�B ��(ہL�jõ����h�2�6Q�5��x�M	�x����ڲ�Mt��      �   R   x�e���0�7�B[$�Kt��?G�����,Θ.UX�V�!#ʊ�RV�W����&=O͈���xr|Ӹ���㵍��P�	���      �   g   x�M�=
�0@�99EvQh�kіB#�����a��ǳ#L�Q�zx��}.���v�E{�i��R���]�&iU�*I�bc��[�h0���Ɂ�5��[�">��n      �   �   x�u�M
�@�יS�-i2��]/ n�Zp�R�"�V3ӂ����G��W@�G�$�i�itn!'օa-���m���e��Ǔ�r�EH:E�R����=AJ�V@F�x6�fhn���r��a!.�������$�bfJ��J��eJ�x;      �   �   x�U�A
1E�?��H�N���˙�+���NA��7iU�|B�x����S���m�Ky""(3��=���j�J��l�Yj�?��hԈ�#�H&3$Ϲn����5A''��{:�8�p˒���� �������ˁ��
a-T      �   �   x�3�,H-*��K��t�-�ɯLM�K�M�s�K��@|C#cNW� �HWW.s��Ԝ��TNo�R��CUi̙���s�`��,c]|=��,8�3sr�8�ATLgP~qbQf>g���*����� K8z     