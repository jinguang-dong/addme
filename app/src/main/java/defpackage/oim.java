package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oim implements oey {
    final /* synthetic */ oez a;
    final /* synthetic */ oio b;
    final /* synthetic */ pfl c;

    public oim(oez oezVar, pfl pflVar, oio oioVar) {
        this.a = oezVar;
        this.c = pflVar;
        this.b = oioVar;
    }

    @Override // defpackage.oey
    public final void a(Status status) {
        if (!status.b()) {
            this.c.c(ojl.aD(status));
        } else {
            this.c.d(this.b.a(this.a.f(TimeUnit.MILLISECONDS)));
        }
    }
}
