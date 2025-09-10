package defpackage;

import android.content.Context;
import j$.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class naw {
    private static final sgv e = sgv.g("naw");
    final Map a;
    final Map b;
    public final Context c;
    public final hgc d;
    private final Map f = new EnumMap(nav.class);
    private final imi g;

    public naw(Context context, imi imiVar, hgc hgcVar) {
        this.c = context;
        this.g = imiVar;
        this.d = hgcVar;
        EnumMap enumMap = new EnumMap(nau.class);
        for (nau nauVar : nau.values()) {
            if (!nauVar.equals(nau.NONE)) {
                nao naoVar = new nao();
                naoVar.e = context.getString(nauVar.l);
                naoVar.h = context;
                naoVar.j = 12;
                naoVar.b = 5000;
                enumMap.put((EnumMap) nauVar, (nau) naoVar.a());
            }
        }
        this.a = enumMap;
        final Map map = this.f;
        EnumMap enumMap2 = new EnumMap(nav.class);
        for (final nav navVar : nav.values()) {
            nao naoVar2 = new nao();
            naoVar2.e = context.getString(navVar.f);
            naoVar2.h = context;
            naoVar2.j = 12;
            naoVar2.a = navVar.g;
            naoVar2.d = new nam() { // from class: nat
                @Override // defpackage.nam
                public final void a(long j) {
                    map.remove(navVar);
                }
            };
            enumMap2.put((EnumMap) navVar, (nav) naoVar2.a());
        }
        this.b = enumMap2;
    }

    public final void a(nav navVar) {
        Map map = this.f;
        if (map.containsKey(navVar)) {
            ((paq) map.get(navVar)).close();
            map.remove(navVar);
        }
    }

    public final void b() {
        Map map = this.f;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((paq) it.next()).close();
        }
        map.clear();
    }

    public final void c(nau nauVar) {
        nan nanVar = (nan) this.a.get(nauVar);
        if (nanVar == null || nauVar.equals(nau.NONE)) {
            return;
        }
        this.g.a(nanVar);
    }

    public final void d(nav navVar) {
        nan nanVar = (nan) this.b.get(navVar);
        if (nanVar == null) {
            ((sgt) e.c().M(5280)).v("No chip found for thermal type: %s", navVar);
            return;
        }
        Map map = this.f;
        Collection.EL.stream(map.entrySet()).filter(new nhh(navVar, 1)).map(new maf(10)).forEach(new mdw(this, 7));
        if (map.isEmpty()) {
            map.put(navVar, this.g.a(nanVar));
        }
    }
}
