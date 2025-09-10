package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class otn extends otm {
    public otn(ofp ofpVar) {
        super(ofpVar);
    }

    @Override // defpackage.osn
    public final void b(ors orsVar) {
        Status statusR = nwj.r(orsVar.a);
        ora oraVar = orsVar.b;
        e(new oqy(statusR, oraVar == null ? null : new oqx(oraVar)));
    }
}
