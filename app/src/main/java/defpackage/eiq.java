package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eiq implements eip {
    public final List a;

    public eiq(List list) {
        this.a = list;
    }

    @Override // defpackage.eip
    public final List b() {
        return this.a;
    }

    @Override // defpackage.eip
    public final boolean c() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((elo) list.get(0)).e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
