package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ryo extends rxm {
    private static final long serialVersionUID = 0;
    transient int d;

    public ryo() {
        this(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = 3;
        int i = objectInputStream.readInt();
        m(new rzf());
        sla.f(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        sla.h(this, objectOutputStream);
    }

    @Override // defpackage.rxm, defpackage.ryb
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.d);
    }

    private ryo(int i, int i2) {
        super(new rzf(i));
        ujp.bq(i2, "expectedValuesPerKey");
        this.d = i2;
    }

    public ryo(sea seaVar) {
        this(seaVar.r().size(), ((ryo) seaVar).d);
        for (Map.Entry entry : seaVar.p()) {
            o(entry.getKey(), entry.getValue());
        }
    }
}
