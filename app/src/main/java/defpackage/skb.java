package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skb extends sjy {
    public static final sjy a = new skb();

    private skb() {
    }

    @Override // defpackage.sjy
    public final sif a(String str) {
        return new sjv(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
