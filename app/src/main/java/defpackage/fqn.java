package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqn implements fqk {
    private final uem a;
    private final uem b;

    public fqn(uem uemVar, uem uemVar2) {
        this.a = uemVar2;
        this.b = uemVar;
    }

    @Override // defpackage.fqk
    public final void a(Throwable th) {
        gox goxVar = (gox) this.a.a();
        int iW = goxVar != null ? goxVar.w() : 0;
        if (th instanceof pjw) {
            mdy mdyVar = (mdy) this.b.a();
            int i = sbp.d;
            sbp sbpVar = sex.a;
            mdyVar.t(12, null, th, -1, -1, iW, sbpVar, sbpVar, pbw.CAMERAS_NOT_ENUMERATED, false);
            return;
        }
        if (!(th instanceof pjv)) {
            mdy mdyVar2 = (mdy) this.b.a();
            int i2 = sbp.d;
            sbp sbpVar2 = sex.a;
            mdyVar2.t(10, null, th, -1, -1, iW, sbpVar2, sbpVar2, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mdy mdyVar3 = (mdy) this.b.a();
        Throwable cause = th.getCause();
        int i3 = sbp.d;
        mdyVar3.t(11, null, cause, -1, -1, iW, sex.a, arrayList, pbw.a(((pjv) th).a), false);
    }
}
