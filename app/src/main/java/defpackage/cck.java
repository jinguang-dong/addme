package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cck implements Appendable {
    public final List a;
    private final StringBuilder b;

    public cck() {
        this((byte[]) null);
    }

    public final ccm a() {
        StringBuilder sb = this.b;
        String string = sb.toString();
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((ccj) list.get(i)).a(sb.length()));
        }
        return new ccm(string, arrayList);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.b.append(c);
        return this;
    }

    public final void b(ccm ccmVar) {
        StringBuilder sb = this.b;
        int length = sb.length();
        sb.append(ccmVar.b);
        List list = ccmVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ccl cclVar = (ccl) list.get(i);
                List list2 = this.a;
                Object obj = cclVar.a;
                int i2 = cclVar.b + length;
                int i3 = cclVar.c + length;
                String str = cclVar.d;
                list2.add(new ccj(obj, i2, i3));
            }
        }
    }

    public /* synthetic */ cck(byte[] bArr) {
        this.b = new StringBuilder(16);
        new ArrayList();
        this.a = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof ccm) {
            b((ccm) charSequence);
            return this;
        }
        this.b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof ccm) {
            ccm ccmVar = (ccm) charSequence;
            StringBuilder sb = this.b;
            String str = ccmVar.b;
            int length = sb.length();
            sb.append((CharSequence) str, i, i2);
            List listA = cco.a(ccmVar, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ccl cclVar = (ccl) listA.get(i3);
                    List list = this.a;
                    Object obj = cclVar.a;
                    int i4 = cclVar.b + length;
                    int i5 = cclVar.c + length;
                    String str2 = cclVar.d;
                    list.add(new ccj(obj, i4, i5));
                }
            }
            return this;
        }
        this.b.append(charSequence, i, i2);
        return this;
    }

    public cck(ccm ccmVar) {
        this((byte[]) null);
        b(ccmVar);
    }
}
