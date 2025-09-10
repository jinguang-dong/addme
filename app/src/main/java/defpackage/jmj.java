package defpackage;

import android.util.Pair;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jmj implements rwe {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmj(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.rwe
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            pdo pdoVarB = ((phc) obj).b();
            if (pdoVarB != null) {
                if (pdoVarB.b == this.a) {
                    return true;
                }
            }
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                Duration duration = lky.a;
                return Duration.ofNanos(this.a - ((Long) ((Pair) obj).second).longValue()).compareTo(lky.a) > 0;
            }
            pdo pdoVarB2 = ((phc) obj).b();
            if (pdoVarB2 != null) {
                if (pdoVarB2.b == this.a) {
                    return true;
                }
            }
            return false;
        }
        phc phcVar = (phc) obj;
        pdo pdoVarB3 = phcVar.b();
        if (!phcVar.f() || pdoVarB3 == null) {
            return false;
        }
        long j = this.a;
        long j2 = pdoVarB3.b;
        if (j2 <= j) {
            return false;
        }
        pdk pdkVarA = phcVar.a();
        if (pdkVarA == null) {
            ((sgt) jml.a.c().M(2844)).u("The frame at %d is null!", j2);
            return false;
        }
        pdkVarA.close();
        return true;
    }
}
