package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxd {
    public final Duration a;
    public final Duration b;
    public final int c;

    public mxd() {
        Instant instant = Instant.MAX;
        this.a = Duration.ZERO;
        this.c = 1;
        this.b = Duration.ZERO;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "ImgCap process[%s] processTime[%d] announce[%s] announceTime[%d] length[%d] words[%d]", "RESULT_UNSPECIFIED", Long.valueOf(this.a.toMillis()), "RESULT_UNSPECIFIED", Long.valueOf(this.b.toMillis()), 0, 0);
    }
}
