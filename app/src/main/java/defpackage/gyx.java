package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyx {
    public static final gzi a;
    public static final gzg b;
    public static final gzg c;
    public static final gzg d;
    public static final gzg e;
    public static final gzg f;
    public static final gzg g;
    public static final gzg h;
    public static final gzg i;
    public static final gzg j;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.face_db";
        b = gzhVar.i();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.post_face_meta";
        gzhVar2.e();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.face_db_yuv";
        gzhVar3.e();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.face_db_darwinn";
        c = gzhVar4.i();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.face_db_gpu";
        d = gzhVar5.i();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.face_db_tm";
        e = gzhVar6.i();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "camera.face_db_save_original";
        gzhVar7.o();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.face_db_debug";
        gzhVar8.e();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.face_db_smart_emb";
        f = gzhVar9.i();
        gzh gzhVar10 = new gzh();
        gzhVar10.b = "camera.face_db_af";
        g = gzhVar10.i();
        gzh gzhVar11 = new gzh();
        gzhVar11.b = "camera.face_db_max_faces";
        a = gzhVar11.a();
        gzh gzhVar12 = new gzh();
        gzhVar12.b = "camera.face_deblur_model_asset_name";
        h = gzhVar12.j();
        gzh gzhVar13 = new gzh();
        gzhVar13.b = "camera.face_deblur_mediapipe";
        i = gzhVar13.i();
        gzh gzhVar14 = new gzh();
        gzhVar14.b = "camera.face_deblur_mp_use_ahwb";
        j = gzhVar14.i();
    }

    public static void a(hbj hbjVar) {
        hbjVar.l(b, false);
        hbjVar.l(c, false);
        hbjVar.l(d, false);
        hbjVar.l(e, false);
        hbjVar.l(f, false);
        hbjVar.l(g, false);
        hbjVar.d(a, 1);
        hbjVar.m(h, null);
        hbjVar.l(i, false);
        hbjVar.l(j, true);
    }
}
