package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egp implements egq, egn {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final eiv e;

    public egp(eiv eivVar) {
        this.e = eivVar;
    }

    private final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        List list = this.d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            egq egqVar = (egq) list.get(size);
            if (egqVar instanceof egh) {
                egh eghVar = (egh) egqVar;
                List listJ = eghVar.j();
                int size2 = listJ.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((egq) listJ.get(size2)).i();
                        pathI.transform(eghVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(egqVar.i());
            }
        }
        egq egqVar2 = (egq) list.get(0);
        if (egqVar2 instanceof egh) {
            egh eghVar2 = (egh) egqVar2;
            List listJ2 = eghVar2.j();
            for (int i = 0; i < listJ2.size(); i++) {
                Path pathI2 = ((egq) listJ2.get(i)).i();
                pathI2.transform(eghVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(egqVar2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.d;
            if (i >= list3.size()) {
                return;
            }
            ((egq) list3.get(i)).f(list, list2);
            i++;
        }
    }

    @Override // defpackage.egg
    public final String g() {
        throw null;
    }

    @Override // defpackage.egn
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            egg eggVar = (egg) listIterator.previous();
            if (eggVar instanceof egq) {
                this.d.add((egq) eggVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.egq
    public final Path i() {
        Path path = this.c;
        path.reset();
        eiv eivVar = this.e;
        if (!eivVar.a) {
            int i = eivVar.b;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    List list = this.d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((egq) list.get(i3)).i());
                    i3++;
                }
            } else {
                if (i2 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i2 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i2 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i2 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
