package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smo extends smp {
    private final Object b;
    private final Object c;

    public smo(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.smp
    public final Optional a(BiFunction biFunction) {
        return Optional.ofNullable(biFunction.apply(this.b, this.c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smo) {
            smo smoVar = (smo) obj;
            if (Objects.equals(this.b, smoVar.b) && Objects.equals(this.c, smoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final String toString() {
        Object obj = this.c;
        return "of(" + this.b.toString() + ", " + obj.toString() + ")";
    }
}
