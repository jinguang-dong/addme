package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocu extends ocz {
    final /* synthetic */ ocv a;
    private final odd b;

    public ocu(ocv ocvVar, odd oddVar) {
        this.a = ocvVar;
        this.b = oddVar;
    }

    @Override // defpackage.ocz
    public final void c(Status status) {
        try {
            if (status.b()) {
                ocv ocvVar = this.a;
                ode.c(ocvVar.a.b).e();
                ocvVar.c();
            } else {
                if (ode.c(this.a.a.b).b() != null) {
                    odb odbVarB = odb.b();
                    odd oddVar = this.b;
                    String str = oddVar.a.a.f;
                    int i = oddVar.b;
                    odbVarB.c(new odc(str, 1003, 1));
                }
            }
        } finally {
            ocw.a.set(false);
        }
    }
}
