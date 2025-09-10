package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asx {
    private final Map a;

    public asx(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asx) {
            return a.ao(this.a, ((asx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
