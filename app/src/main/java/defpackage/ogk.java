package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.wear.ambient.WearableControllerProvider;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogk {
    public int a;
    public final Object b;
    public Object c;

    public ogk(caa caaVar) {
        this.b = caaVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void a(int i, int i2, Intent intent) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ogh) it.next()).c(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    final void b(Bundle bundle) {
        this.a = 1;
        this.c = bundle;
        for (Map.Entry entry : this.b.entrySet()) {
            ((ogh) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void c() {
        this.a = 5;
        for (ogh oghVar : this.b.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void d() {
        this.a = 3;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ogh) it.next()).h();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((ogh) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void f() {
        this.a = 2;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ogh) it.next()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void g() {
        this.a = 4;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((ogh) it.next()).j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final void h(ogh oghVar) {
        ?? r0 = this.b;
        if (r0.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        r0.put("ConnectionlessLifecycleHelper", oghVar);
        if (this.a > 0) {
            new ols(Looper.getMainLooper()).post(new lqd(this, oghVar, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final void i() {
        for (ogh oghVar : this.b.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final ogh j(Class cls) {
        return (ogh) cls.cast(this.b.get("ConnectionlessLifecycleHelper"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Appendable, java.lang.Object] */
    public final void k(CharSequence charSequence) throws IOException {
        try {
            this.b.append(charSequence);
            this.a += charSequence.length();
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void l(Format format, Object obj) throws IOException {
        if (this.c == null) {
            k(format.format(obj));
            return;
        }
        AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.a;
        ?? r0 = this.b;
        try {
            int beginIndex = toCharacterIterator.getBeginIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                r0.append(toCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        r0.append(toCharacterIterator.next());
                    }
                }
            }
            this.a = i2 + i;
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex2 = toCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new eof(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    public final void m(Format format, Object obj, String str) throws IOException {
        if (this.c != null || str == null) {
            l(format, obj);
        } else {
            k(str);
        }
    }

    public final nw n(int i) {
        Object obj = this.c;
        if (obj != null) {
            nw nwVar = (nw) obj;
            int i2 = nwVar.a;
            if (i < nwVar.b + i2 && i2 <= i) {
                return nwVar;
            }
        }
        bdp bdpVar = (bdp) this.b;
        nw nwVar2 = (nw) bdpVar.a[WearableControllerProvider.c(bdpVar, i)];
        this.c = nwVar2;
        return nwVar2;
    }

    public ogk(byte[] bArr) {
        this.b = new bdp(new nw[16]);
    }

    public ogk() {
        this.b = DesugarCollections.synchronizedMap(new yd());
        this.a = 0;
    }

    public ogk(StringBuffer stringBuffer) {
        this.b = stringBuffer;
        this.a = stringBuffer.length();
        this.c = null;
    }

    public ogk(StringBuilder sb) {
        this.b = sb;
        this.a = sb.length();
        this.c = null;
    }
}
