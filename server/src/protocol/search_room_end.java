package protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class search_room_end extends message {

	@Override

	public int id(){
		 return 28;
	}

	@Override
	public int length(){
		 return 0 ;
	}

	public ByteBuf data(){
		ByteBuf byteBuffer = Unpooled.buffer(8+length());
		byteBuffer.writeInt(id());
		byteBuffer.writeInt(length());
		byteBuffer.writeByte(64);
		byteBuffer.writeByte(64);
		return byteBuffer;
	}

	@Override
	public void parse_data(ByteBuf byteBuffer){
	}
}
