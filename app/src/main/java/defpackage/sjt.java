package defpackage;

import android.util.Log;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sjt extends sjg {
    private final String a;
    private final boolean b;
    private final Level c;
    private final boolean d;
    private final Set e;
    private final siq f;
    private final int g;

    public sjt(String str, String str2, boolean z, int i, Level level, boolean z2, Set set, siq siqVar) {
        super(str2);
        this.a = str;
        this.b = z;
        this.g = 2;
        this.c = level;
        this.d = z2;
        this.e = set;
        this.f = siqVar;
    }

    @Override // defpackage.sif
    public final boolean d(Level level) {
        return true;
    }

    @Override // defpackage.sif
    public final void c(sid sidVar) {
        String strB = (String) sidVar.k().d(shx.a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = sidVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strD = ske.d(this.a, strB, this.b);
        Level levelO = sidVar.o();
        if (!this.d) {
            int iE = ske.e(levelO);
            if (!Log.isLoggable(strD, iE) && !Log.isLoggable(zflNUOOzDfM.tnjeyWxYWMRou, iE)) {
                return;
            }
        }
        sju.e(sidVar, strD, 2, this.c, this.e, this.f);
    }
}
