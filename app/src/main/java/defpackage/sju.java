package defpackage;

import android.util.Log;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sju extends sjg {
    public static final Set a;
    public static final siq b;
    public static final sjs c;
    private final String d;
    private final Level e;
    private final Set f;
    private final siq g;
    private final int h;

    public sju(String str, String str2, boolean z, int i, Level level, Set set, siq siqVar) {
        super(str2);
        this.d = ske.d(str, str2, z);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = siqVar;
    }

    public static void e(sid sidVar, String str, int i, Level level, Set set, siq siqVar) {
        String string;
        Boolean bool = (Boolean) sidVar.k().d(shy.a);
        if (bool == null || !bool.booleanValue()) {
            sja sjaVarG = sja.g(sjd.f(), sidVar.k());
            boolean z = sidVar.o().intValue() < level.intValue();
            if (z || sje.b(sidVar, sjaVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (ujp.ad(2, sidVar.f(), sb)) {
                    sb.append(" ");
                }
                if (!z || sidVar.l() == null) {
                    sks.e(sidVar, sb);
                    sje.c(sjaVarG, siqVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(sidVar.l().b);
                }
                string = sb.toString();
            } else {
                string = sje.a(sidVar);
            }
            Throwable th = (Throwable) sidVar.k().d(sgy.a);
            int iE = ske.e(sidVar.o());
            if (iE == 2 || iE == 3 || iE == 4) {
                return;
            }
            if (iE != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.sif
    public final void c(sid sidVar) {
        e(sidVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.sif
    public final boolean d(Level level) {
        String str = this.d;
        int iE = ske.e(level);
        return Log.isLoggable(str, iE) || Log.isLoggable("all", iE);
    }

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(sgy.a, shx.a, shy.a)));
        a = setUnmodifiableSet;
        siq siqVarA = sit.a(setUnmodifiableSet);
        b = siqVarA;
        c = new sjs(VnmwoBe.vCbRVGHJAatmuMa, true, 2, Level.ALL, false, setUnmodifiableSet, siqVarA);
    }
}
