package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ai extends cq implements ce {
    final ch a;
    boolean b;
    int c;

    public ai(ch chVar) {
        chVar.h();
        bu buVar = chVar.m;
        if (buVar != null) {
            buVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = chVar;
    }

    final void a(int i) {
        if (this.j) {
            if (ch.X(2)) {
                toString();
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cp cpVar = (cp) arrayList.get(i2);
                bm bmVar = cpVar.b;
                if (bmVar != null) {
                    bmVar.z += i;
                    if (ch.X(2)) {
                        Objects.toString(cpVar.b);
                        int i3 = cpVar.b.z;
                    }
                }
            }
        }
    }

    final void b() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cp cpVar = (cp) arrayList.get(size);
            if (cpVar.c) {
                int i = size - 1;
                if (cpVar.a == 8) {
                    cpVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = cpVar.b.F;
                    cpVar.a = 2;
                    cpVar.c = false;
                    while (i >= 0) {
                        cp cpVar2 = (cp) arrayList.get(i);
                        if (cpVar2.c && cpVar2.b.F == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.cq
    public final void c() {
        o();
        this.a.H(this, false);
    }

    @Override // defpackage.cq
    public final void d(int i, bm bmVar, String str, int i2) {
        String str2 = bmVar.mPreviousWho;
        if (str2 != null) {
            cui.a(bmVar, str2);
        }
        Class<?> cls = bmVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bmVar.G;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + bmVar + ": was " + bmVar.G + " now " + str);
            }
            bmVar.G = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bmVar + " with tag " + str + " to container view with no id");
            }
            int i3 = bmVar.E;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + bmVar + ": was " + bmVar.E + " now " + i);
            }
            bmVar.E = i;
            bmVar.F = i;
        }
        l(new cp(i2, bmVar));
        bmVar.A = this.a;
    }

    public final void e(String str, PrintWriter printWriter) {
        f(str, printWriter, true);
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cp cpVar = (cp) arrayList.get(i);
            switch (cpVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + cpVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cpVar.b);
            if (z) {
                if (cpVar.d != 0 || cpVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cpVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cpVar.e));
                }
                if (cpVar.f != 0 || cpVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cpVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cpVar.g));
                }
            }
        }
    }

    @Override // defpackage.ce
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        if (ch.X(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.cq
    public final void h() {
        j(false, true);
    }

    @Override // defpackage.cq
    public final void i() {
        j(true, true);
    }

    final void j(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (ch.X(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new db());
            e("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.i.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.G(this, z);
        }
    }

    @Override // defpackage.cq
    public final void k(bm bmVar) {
        ch chVar = bmVar.A;
        if (chVar == null || chVar == this.a) {
            l(new cp(3, bmVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bmVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
