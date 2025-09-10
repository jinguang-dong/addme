package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cjz implements cjx {
    public final ckh d;
    public int e;
    public int f;
    public cjx a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    cka h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public cjz(ckh ckhVar) {
        this.d = ckhVar;
    }

    public final void a(cjx cjxVar) {
        this.j.add(cjxVar);
        if (this.i) {
            cjxVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((cjx) it.next()).f();
        }
    }

    @Override // defpackage.cjx
    public final void f() {
        List<cjz> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((cjz) it.next()).i) {
                return;
            }
        }
        this.c = true;
        cjx cjxVar = this.a;
        if (cjxVar != null) {
            cjxVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        cjz cjzVar = null;
        for (cjz cjzVar2 : list) {
            if (!(cjzVar2 instanceof cka)) {
                i++;
                cjzVar = cjzVar2;
            }
        }
        if (cjzVar != null && i == 1 && cjzVar.i) {
            cka ckaVar = this.h;
            if (ckaVar != null) {
                if (!ckaVar.i) {
                    return;
                } else {
                    this.e = this.g * ckaVar.f;
                }
            }
            c(cjzVar.f + this.e);
        }
        cjx cjxVar2 = this.a;
        if (cjxVar2 != null) {
            cjxVar2.f();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.ai);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        sb.append(this.i ? Integer.valueOf(this.f) : VnmwoBe.jXMkMA);
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
