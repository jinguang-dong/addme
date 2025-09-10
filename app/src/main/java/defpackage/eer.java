package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eer {
    private final List a = new ArrayList(5);

    public final int a() {
        return this.a.size();
    }

    public final ees b(int i) {
        return (ees) this.a.get(i);
    }

    public final void c(ees eesVar) {
        this.a.add(eesVar);
    }

    public final String toString() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 1;
        while (i2 < a()) {
            int i3 = i2 + 1;
            stringBuffer.append(b(i2));
            if (i2 < a() - 1 && ((i = b(i3).b) == 1 || i == 2)) {
                stringBuffer.append('/');
            }
            i2 = i3;
        }
        return stringBuffer.toString();
    }
}
