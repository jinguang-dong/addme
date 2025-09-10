package defpackage;

import android.os.SystemClock;
import com.google.ar.core.R;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fly {
    public static final sgv a = sgv.g("fly");
    public static final sbv b;
    public final mdy g;
    private final owf j;
    private final owf k;
    private final owf l;
    private final owf m;
    public final tpc h = spk.a.m();
    public final tpc i = spj.a.m();
    public final Map c = new EnumMap(spi.class);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public our e = null;
    public boolean f = false;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(Integer.valueOf(R.string.tracking_status_bad_motion), spi.HOLD_STILL);
        sbrVar.f(Integer.valueOf(R.string.tracking_status_bad_scene), spi.AVOID_BLANK_SCENE);
        sbrVar.f(Integer.valueOf(R.string.tracking_status_bad_lighting), spi.NEEDS_LIGHT);
        sbrVar.f(Integer.valueOf(R.string.tracking_status_not_reliable), spi.MOVE_CAMERA);
        sbrVar.f(Integer.valueOf(R.string.error_desc_unsupported_scene), spi.GENERIC_SCENE_SUGGESTION);
        sbrVar.f(Integer.valueOf(R.string.tracking_status_unknown), spi.UNKNOWN);
        b = sbrVar.b();
    }

    public fly(mdy mdyVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4) {
        this.g = mdyVar;
        this.j = owfVar;
        this.k = owfVar2;
        this.l = owfVar3;
        this.m = owfVar4;
    }

    public final synchronized void a() {
        tpc tpcVar = this.h;
        if ((((spk) tpcVar.b).b & 128) != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spk spkVar = (spk) tpcVar.b;
        spkVar.b |= 128;
        spkVar.j = jElapsedRealtime;
    }

    public final synchronized void b() {
        if (this.e != null) {
            ((sgt) a.b().M(270)).s("Already noted mode start.");
            return;
        }
        our ourVar = new our();
        tpc tpcVar = this.h;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spk spkVar = (spk) tpcVar.b;
        spk spkVar2 = spk.a;
        spkVar.b |= 1;
        spkVar.c = jElapsedRealtime;
        owf owfVar = this.j;
        fbt fbtVar = new fbt(this, 18);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVar.dK(fbtVar, sxoVar));
        ourVar.d(this.k.dK(new fbt(this, 19), sxoVar));
        ourVar.d(this.l.dK(new fbt(this, 20), sxoVar));
        ourVar.d(this.m.dK(new fpe(this, 1), sxoVar));
        this.e = ourVar;
    }

    public final synchronized void c() {
        tpc tpcVar = this.h;
        if ((((spk) tpcVar.b).b & 64) != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spk spkVar = (spk) tpcVar.b;
        spkVar.b |= 64;
        spkVar.i = jElapsedRealtime;
    }

    public final synchronized void d(boolean z) {
        if (z) {
            tpc tpcVar = this.h;
            if ((((spk) tpcVar.b).b & 16) == 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                spk spkVar = (spk) tpcVar.b;
                spkVar.b |= 16;
                spkVar.g = jElapsedRealtime;
            }
        }
    }
}
