package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class syt {
    private final String a;
    private volatile Logger b;
    private final ujf c = new ujf();

    public syt(Class cls) {
        this.a = cls.getName();
    }

    final Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            Logger logger2 = this.b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.a);
            this.b = logger3;
            return logger3;
        }
    }
}
