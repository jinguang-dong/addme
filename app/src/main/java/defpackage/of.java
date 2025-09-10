package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class of extends oc {
    final /* synthetic */ og a;
    final /* synthetic */ String b;
    final /* synthetic */ ok c;

    public of(og ogVar, String str, ok okVar) {
        this.a = ogVar;
        this.b = str;
        this.c = okVar;
    }

    @Override // defpackage.oc
    public final void a() {
        this.a.e(this.b);
    }

    @Override // defpackage.oc
    public final void b(Object obj) throws Exception {
        og ogVar = this.a;
        Map map = ogVar.b;
        ok okVar = this.c;
        String str = this.b;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            throw new IllegalStateException(a.bA(obj, okVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", ". You must ensure the ActivityResultLauncher is registered before calling launch()."));
        }
        int iIntValue = ((Number) obj2).intValue();
        ogVar.d.add(str);
        try {
            ogVar.g(iIntValue, okVar, obj);
        } catch (Exception e) {
            og ogVar2 = this.a;
            ogVar2.d.remove(this.b);
            throw e;
        }
    }
}
