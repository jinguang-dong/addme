package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogv extends bm implements ogi {
    public static final WeakHashMap a = new WeakHashMap();
    private final ogk b = new ogk();

    @Override // defpackage.ogi
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.ogi
    public final void b(ogh oghVar) {
        this.b.h(oghVar);
    }

    @Override // defpackage.ogi
    public final ogh c(Class cls) {
        return this.b.j(cls);
    }

    @Override // defpackage.bm
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // defpackage.bm
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // defpackage.bm
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.bm
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // defpackage.bm
    public final void onResume() {
        super.onResume();
        this.b.d();
    }

    @Override // defpackage.bm
    public final void onSaveInstanceState(Bundle bundle) {
        this.b.e(bundle);
    }

    @Override // defpackage.bm
    public final void onStart() {
        super.onStart();
        this.b.f();
    }

    @Override // defpackage.bm
    public final void onStop() {
        super.onStop();
        this.b.g();
    }
}
