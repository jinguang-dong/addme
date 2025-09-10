package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osx implements ofp {
    final /* synthetic */ pfl a;

    public osx(pfl pflVar) {
        this.a = pflVar;
    }

    @Override // defpackage.ofp
    public final /* synthetic */ void d(Object obj) {
        osv osvVar = (osv) obj;
        Status status = osvVar.a;
        if (status.b()) {
            this.a.d(Integer.valueOf(osvVar.b));
        } else {
            this.a.c(ojl.aD(status));
        }
    }
}
