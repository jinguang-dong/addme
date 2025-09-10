package defpackage;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enx {
    private final Point a;

    public enx(int i, int i2) {
        this.a = new Point(i, i2);
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new enx((Size) it.next()));
        }
        return arrayList;
    }

    public final int a() {
        return this.a.y;
    }

    public final int b() {
        return this.a.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enx) {
            return this.a.equals(((enx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Size: (" + b() + " x " + a() + ")";
    }

    public enx(Camera.Size size) {
        if (size == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(size.width, size.height);
        }
    }

    public enx(Size size) {
        if (size == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(size.getWidth(), size.getHeight());
        }
    }

    public enx(enx enxVar) {
        if (enxVar == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(enxVar.b(), enxVar.a());
        }
    }
}
