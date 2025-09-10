package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sgm {
    public final sif a;

    protected sgm(sif sifVar) {
        this.a = sifVar;
    }

    public static void d(String str, sid sidVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(sidVar.e()))));
        sb.append(": logging error [");
        ujp.ad(1, sidVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract shi a(Level level);

    public final shi b() {
        return a(Level.SEVERE);
    }

    public final shi c() {
        return a(Level.WARNING);
    }

    protected final boolean e(Level level) {
        return this.a.d(level);
    }
}
