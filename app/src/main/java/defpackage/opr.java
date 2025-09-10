package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opr extends opn {
    private final ofp a;
    private final opo b;
    private final tyq c;

    public opr(opo opoVar, ofp ofpVar, tyq tyqVar) {
        this.b = opoVar;
        this.a = ofpVar;
        this.c = tyqVar;
    }

    @Override // defpackage.opn
    public final void c(Status status) {
        if (status.b()) {
            this.a.d(Status.a);
        } else {
            this.a.d(status);
        }
    }

    @Override // defpackage.opn
    public final void d(Status status) {
        if (!status.b()) {
            this.a.d(status);
            return;
        }
        tyq tyqVar = this.c;
        if (tyqVar == null) {
            this.a.d(Status.a);
        } else {
            this.b.e(tyqVar, this);
        }
    }
}
