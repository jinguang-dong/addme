package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ras implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public ras(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            syw sywVar = (syw) this.a.a();
            sywVar.getClass();
            return new uoe(sywVar);
        }
        if (i == 1) {
            return new swb() { // from class: qvi
                @Override // defpackage.swb
                public final Instant a() {
                    return Instant.ofEpochMilli(SystemClock.elapsedRealtime());
                }
            };
        }
        if (i != 2) {
            return i != 3 ? new rtl(this.a, null) : new qqe(((imm) this.a).b(), null);
        }
        uhf uhfVar = (uhf) this.a.a();
        uhfVar.getClass();
        return ung.j(uhfVar.plus(new upi()));
    }
}
