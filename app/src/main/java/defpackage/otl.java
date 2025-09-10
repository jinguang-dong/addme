package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otl implements ofp {
    final pfl a;
    private final /* synthetic */ int b;

    public otl(pfl pflVar, int i) {
        this.b = i;
        this.a = pflVar;
    }

    @Override // defpackage.ofp
    public final /* synthetic */ void d(Object obj) {
        if (this.b == 0) {
            Status status = (Status) obj;
            int i = status.e;
            if (i == 0 || i == 4001) {
                this.a.d(null);
                return;
            } else {
                this.a.c(new oep(status));
                return;
            }
        }
        Status status2 = (Status) obj;
        int i2 = status2.e;
        if (i2 == 0) {
            this.a.d(true);
        } else if (i2 == 4002) {
            this.a.d(false);
        } else {
            this.a.c(new oep(status2));
        }
    }
}
