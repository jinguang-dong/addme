package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmi extends tiv {
    static final tiw a = new tke(5);
    private final tiv b;

    public tmi(tiv tivVar) {
        this.b = tivVar;
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        Date date = (Date) this.b.a(tmlVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
