package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cmv {
    final String a;
    final String b;
    final List c;

    public cmv(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmv)) {
            return false;
        }
        cmv cmvVar = (cmv) obj;
        return Objects.equals(this.a, cmvVar.a) && Objects.equals(this.b, cmvVar.b) && Objects.equals(this.c, cmvVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
