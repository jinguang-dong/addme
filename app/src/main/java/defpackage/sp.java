package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sp implements AutoCloseable {
    public final String a;
    public final CameraManager b;
    public final utj c;
    public final usr d;
    public final usu e;
    public final urk f;
    public final utl g;
    public final qrh h;
    private final und i;
    private final uly j;
    private final uol k;

    public sp(uem uemVar, qrh qrhVar, String str) {
        this.h = qrhVar;
        this.a = str;
        this.b = (CameraManager) uemVar.a();
        und undVarJ = ung.j(((ugx) qrhVar.c).plus(new unc("CXCP-CameraStatusMonitor")));
        this.i = undVarJ;
        this.j = new uly(false, umc.a);
        utl utlVarA = utm.a(ww.a);
        this.g = utlVarA;
        this.c = new ust(utlVarA);
        usr usrVarE = usy.e(0, 0, 0, 7);
        this.d = usrVarE;
        this.e = new uss(usrVarE);
        this.f = new urf(new su(this, (uhb) null, 1));
        this.k = ukc.C(undVarJ, null, 0, new si(this, (uhb) null, 4), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.j.b()) {
            this.k.s(null);
        }
    }
}
