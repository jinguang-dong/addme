package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class eeg implements Iterator {
    final /* synthetic */ eei a;
    public eef b;
    private int c;
    private een d;
    private String e;
    private Iterator f;
    private int g;
    private Iterator h;

    public eeg(eei eeiVar) {
        this.a = eeiVar;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
    }

    protected static final eef b(een eenVar, String str, String str2) {
        return new eef(str, str2, eenVar.g().n() ? null : eenVar.b, eenVar);
    }

    private final boolean c(Iterator it) {
        if (!this.h.hasNext() && it.hasNext()) {
            een eenVar = (een) it.next();
            int i = this.g + 1;
            this.g = i;
            this.h = new eeg(this.a, eenVar, this.e, i);
        }
        if (!this.h.hasNext()) {
            return false;
        }
        this.b = (eef) this.h.next();
        return true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        int i = this.c;
        if (i == 0) {
            this.c = 1;
            een eenVar = this.d;
            if (eenVar.c != null) {
                eei eeiVar = this.a;
                if (!eeiVar.a.b() || !eenVar.t()) {
                    this.b = b(this.d, eeiVar.b, this.e);
                    return true;
                }
            }
            return hasNext();
        }
        if (i != 1) {
            if (this.f == null) {
                this.f = this.d.i();
            }
            return c(this.f);
        }
        if (this.f == null) {
            this.f = this.d.h();
        }
        boolean zC = c(this.f);
        if (zC || !this.d.u() || this.a.a.h(4096)) {
            return zC;
        }
        this.c = 2;
        this.f = null;
        return hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more nodes to return");
        }
        eef eefVar = this.b;
        this.b = null;
        return eefVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public eeg(eei eeiVar, een eenVar, String str, int i) {
        this.a = eeiVar;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
        this.d = eenVar;
        this.c = 0;
        if (eenVar.g().n()) {
            eeiVar.b = eenVar.a;
        }
        this.e = a(eenVar, str, i);
    }

    protected final String a(een eenVar, String str, int i) {
        String str2;
        String str3;
        if (eenVar.c == null || eenVar.g().n()) {
            return null;
        }
        if (eenVar.c.g().d()) {
            str2 = "[" + String.valueOf(i) + "]";
            str3 = "";
        } else {
            str2 = eenVar.a;
            str3 = CZAHo.EZWEbbINgBc;
        }
        if (str != null && str.length() != 0) {
            if (!this.a.a.h(1024)) {
                return str + str3 + str2;
            }
            if (str2.startsWith("?")) {
                return str2.substring(1);
            }
        }
        return str2;
    }
}
