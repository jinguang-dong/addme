package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jgi implements jgs {
    private final /* synthetic */ int a;

    public /* synthetic */ jgi(int i) {
        this.a = i;
    }

    @Override // defpackage.jgs
    public final void a(jhh jhhVar) {
        int i = this.a;
        if (i == 0) {
            if (jhhVar instanceof jgk) {
                ((jgk) jhhVar).a();
            }
        } else {
            if (i == 1) {
                int i2 = jgt.f;
                if (jhhVar instanceof jfx) {
                    ((jfx) jhhVar).a();
                    return;
                }
                return;
            }
            if (i != 2) {
                if (jhhVar instanceof jgm) {
                    ((jgm) jhhVar).c();
                }
            } else if (jhhVar instanceof mhn) {
                ((mhn) jhhVar).e();
            }
        }
    }
}
